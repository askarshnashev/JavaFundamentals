package JavaFundamental_OptionalTask1_2;
import java.util.*;
public class JavaFundamental_OptionalTask1_2 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Greetings, purpose and instructions
		System.out.println ("Hello User,\nPurpose of this program is to sort out "
				+ "inputted integers according to their digit length ascendingly.");
		
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
		
		Arrays.sort(data);
		
		System.out.println ("Integers sorted out ascendingly according to their "
				+ "digit length:");
		for (int i=0;i<howMany;i++) {
			
			System.out.println (data[i]);
		}

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
