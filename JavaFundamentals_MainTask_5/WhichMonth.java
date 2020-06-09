package JavaFundamentals_MainTask_5;

import java.util.Scanner;
import java.util.InputMismatchException;
public class WhichMonth {
static Scanner number= new Scanner(System.in); // create scanner object
	public static void main(String[] args) {
		// Greetings and purpose 
		
		System.out.println ("Hello User,\nPurpose of this program is to "
				+ "output corresponding month of the calendar to inputted number.");
		
		System.out.println ("Please input integer from 1 to 12:");
		while (true) {int input=getNumber (); //while loop for continues input from user
		String month;
		//for this example going to use switch-case 
		switch (input) {
		case 1: month="January";
		System.out.println ("That's corresponds to "+month+".\nPlease enter another "
				+ "number:");
		break;
		case 2: month="February";
		System.out.println ("That's corresponds to "+month+".\nPlease enter another "
				+ "number:");
		break;
		case 3: month="March";
		System.out.println ("That's corresponds to "+month+".\nPlease enter another "
				+ "number:");
		break;
		case 4: month="April";
		System.out.println ("That's corresponds to "+month+".\nPlease enter another "
				+ "number:");
		break;
		case 5: month="May";
		System.out.println ("That's corresponds to "+month+".\nPlease enter another "
				+ "number:");
		case 6: month="June";
		System.out.println ("That's corresponds to "+month+".\nPlease enter another "
				+ "number:");
		break;
		case 7: month="July";
		System.out.println ("That's corresponds to "+month+".\nPlease enter another "
				+ "number:");
		break;
		case 8: month="August";
		System.out.println ("That's corresponds to "+month+".\nPlease enter another "
				+ "number:");
		break;
		case 9: month="September";
		System.out.println ("That's corresponds to "+month+".\nPlease enter another "
				+ "number:");
		break;
		case 10: month="October";
		System.out.println ("That's corresponds to "+month+".\nPlease enter another "
				+ "number:");
		break;
		case 11: month="November";
		System.out.println ("That's corresponds to "+month+".\nPlease enter another "
				+ "number:");
		break;
		case 12: month="December";
		System.out.println ("That's corresponds to "+month+".\nPlease enter another "
				+ "number:");
		break;
		// when user inputs number out of ranges
		default: System.out.println ("Out of ranges.Please input integer from 1 to 12");
		break;
			}
		}	
	}
	//implementation of static method for user input and wrong type of input exception catch
	public static int getNumber() {
		try {
		return number.nextInt();
	}
		catch (InputMismatchException exc) {
			System.out.println ("Please input integer from 1 to 12:");
			return number.nextInt();
		}
	}
}
