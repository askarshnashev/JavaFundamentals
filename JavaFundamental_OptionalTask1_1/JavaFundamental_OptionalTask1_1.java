package JavaFundamental_OptionalTask1_1;
import java.util.*;
public class JavaFundamental_OptionalTask1_1 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Greetings, purpose and instructions
		System.out.println ("Hello User,\nPurpose of this program is to give you the "
				+ "shortest and longest integer from list you inputted.\nIf length of any"
				+ " integers are equal, output will be the smallest one.");
		
		//get how many numbers user is going to input
		System.out.println ("How many numbers you going to input?:");
		int howMany = getHowMany ();
		
		//get an array from the inputed numbers
		String s;
		if (howMany<=1) {
			s="number";
		}
		else {s="numbers";}
		System.out.println ("Please input "+howMany+" "+s);
		int [] data = new int [howMany];
		for (int i=0; i<howMany; i++) {
			//use static method for input
			data [i]= getNumbers ();
		}
		
		// get array of digit length by converting integers to string
		int [] dataLength = new int [howMany];
		for (int i=0; i<howMany; i++) {
			dataLength [i]=String.valueOf(data[i]).length();
		}
		//sort array of lengths
		Arrays.sort(dataLength);
		
		//find the shortest and longest integers by comparing
		//each element of the array and find integers of equal length
		int dataMin=data[0];
		int dataMax=data[0];
		int equals1=0;
		int equals2=0;
		
		for (int i=0; i<howMany; i++) {
			if (dataLength[0]==dataLength[i]) {
				equals1++;
				
			}
			if (dataMin>data[i]) {
				dataMin=data[i];
			}
			if (dataLength[howMany-1]==dataLength[i]) {
				equals2++;
			}
			if (dataMax<data [i]) {
				dataMax=data[i];
			}
		}
		
		//ensure grammatics and print out results
		//printout info if there are more than 1 shortest and longest integers
		
		String s1,s2;
		if (dataLength[0]<=1) {
			s1="digit";
		}
		else {s1="digits";}
		
		if (dataLength[howMany-1]<=1) {
			s2="digit";
		}
		else {s2="digits";}
		
		
		if (equals1>1) {
			System.out.println ("There are "+equals1+" shortest integers."
					+ "\nSmallest one will be considered as shortest.\n");
		}
		if (equals2>1) {
			System.out.println ("There are "+equals1+" longest integers "
					+ "\nBiggest one will be considered as longest.\n");
		}
		
		
		System.out.println ("The shortest integer is: " + dataMin+
				". It consist of "+ dataLength[0]+" "+ s1+".");
		System.out.println ("The longest integer is: " + dataMax+
				". It consist of "+ dataLength[howMany-1]+" "+ s2 +".");
		
		

	}	
	
	//implementations of methods for input from user
	//catch exceptions and wrongs inputs
public static int getHowMany () {
	while (true ) {try { 
		int i=input.nextInt();
		if (i<=0) {
			System.out.println ("Please input positive number.");
		} else	return i;
	}
	catch (InputMismatchException exc) {
		System.out.println ("That's not a integer. Please try again :");
		input.next();
		}
	}
}

public static int getNumbers () {
	while (true) { 
			try {
				 return input.nextInt();	
		}
		catch (InputMismatchException exc) { 
			System.out.println ("That's not a integer. Please try again :");
			input.next();
			}
		}


	}

}
