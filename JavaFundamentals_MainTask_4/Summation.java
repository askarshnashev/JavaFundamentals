package JavaFundamentals_MainTask_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Summation {
	static Scanner input= new Scanner (System.in); // generate scanner object
	static int temp=0;
	static int count=0;
	public static void main(String[] args) {
	
		System.out.println ("Dear User,"
				+ "\nPurpose of this program is to add and output sum of inputted integers. "
				+ "Program continuesly adds inputted numbers"
				+ "\nPlease input integer numbers seperated"
				+ " by space and press ENTER:"); // greetings, instructions and purpose 
	   while (true) {getNumbers (); // get input from user 
	   System.out.println ("Sum of first "+count+" integers is: "+temp);
		}
	}
	// implementation of the method to get correct input from user
	public static int getNumbers () {
		while (true) { //while loop
			try {temp=temp+input.nextInt();
				count++;
				 return temp;
				 }
			catch (InputMismatchException exc) { // catch exception if user inputs 
			//wrong data
			System.out.println ("There's a none integer number input. Please try again :");
			input.next();
				}

			}
		}
	
	}
