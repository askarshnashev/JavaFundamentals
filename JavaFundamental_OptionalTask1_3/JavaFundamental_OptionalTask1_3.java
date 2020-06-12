package JavaFundamental_OptionalTask1_3;
import java.util.*;
public class JavaFundamental_OptionalTask1_3 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Greetings, purpose and instructions
		System.out.println ("Hello User,\nPurpose of this program is to give you the "
				+ "integers shorter than average length of all integers.");
		
		//get how many numbers user is going to input
		System.out.println ("How many numbers you going to input?:");
		int howMany = getHowMany ();
		
		System.out.println ("Please input "+howMany+" integers");
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
		
		//find average length
		double average=0;
		for (int i=0;i<howMany; i++) {
			average += dataLength [i];
			
		}
		average=average/howMany;
		
		
		//implement bubble sort algorithm to sort 
		//dataLength linked with data itself
		bubbleSort(dataLength, data);
		//print out average length
		System.out.println ("Average length of integers: "+average)
		;
		//print out data elements with shorter length of digits than average	
		System.out.println ("Integers with length shorter than average length: ");
		for (int i=0; i < howMany; i++) {
			if (dataLength [i]<average) {
				
				System.out.println(data[i]+". Digit length: "+dataLength[i]+".");
			}
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

//implementation of method for sorting data according to dataLength
public static void bubbleSort (int dataLength [],int data[]) {
	
        int n = dataLength.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (dataLength[j] > dataLength[j+1]) 
                { 
                    // swap [j+1] and [i] 
                    int temp = dataLength[j]; 
                    int temp2=data [j];
                    dataLength[j] = dataLength[j+1];
                    data[j]=data [j+1];
                    dataLength[j+1] = temp;
                    data[j+1]=temp2;
                    
                 
    } 
	
}

}
