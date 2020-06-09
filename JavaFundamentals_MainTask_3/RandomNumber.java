package JavaFundamentals_MainTask_3;

import java.util.InputMismatchException;
import java.util.Scanner;
public class RandomNumber {
	static Scanner input= new Scanner (System.in); // generate scanner object

	public static void main(String[] args) {
		System.out.println ("Dear User,\nPlease input how many random integer numbers you "
				+ "want to generate and press ENTER:"); // welcome and instructions
		while (true ) {int userData=getNumber (); // get input from user by static method
		int[] randomNumbers = new int [userData]; // create array of integers
		for (int i=0;i<userData;i++) { //loop to print out array of random numbers
			randomNumbers [i] = (int)(Math.random()*1000);// by using Math class
			System.out.print(randomNumbers[i]+" ");
			
			}
		System.out.println ("\nSame set of numbers with line break: ");
		for (int i=0;i<userData;i++) { //loop to print out array of random numbers
			//with line break
			System.out.print(randomNumbers[i]+"\n");
			
			}
		
		
		System.out.println("\nPlease enter an integer for another round:");
		
		}

	}
	// implementation of the method to get correct input from user
	public static int getNumber () {
		while (true) { //while loop
			try {
				 return input.nextInt();	
		}
		catch (InputMismatchException exc) { // catch exception if user inputs 
			//wrong data
			System.out.println ("That's not a integer number. Please try again :");
			input.next();
			}

		}
	}
}
