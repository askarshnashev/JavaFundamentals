package JavaFundamentals_MainTask_2;
import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[] args) {
		
		
		String data; // holds inputed data from user
		
		System.out.println("Hello User,\nPurpose of this program is to "
				+ "reverse the inputted data.\nPlease input any word or number "
				+ "and press ENTER(type STOP to Exit): ");//print info
		Scanner input= new Scanner (System.in);//New Scanner Object
		do {data=input.nextLine();// New string from console
		if (data.equals("STOP")==false){// check user choice to continue
		char stringToArray [] = data.toCharArray(); //input string to character array
		reverse(stringToArray, 0, stringToArray.length-1);//use method reverse() 
		//to reverse the CharArray
		System.out.println ("Result of reversing your input is : ");
		// print without concatenation to avoid explicitly converting array to string
		System.out.println (stringToArray);
		System.out.println ("Input another data (type STOP to Exit):");
		}}
		while (!data.equals("STOP"));
		
		
		
			
		}
	// implementation of the array reversing method using recursion
	static void reverse(char array[], int start, int end) { 
        char temp; 
        if (start >= end) 
            return ; 
        temp = array[start]; 
        array[start] = array[end]; 
        array[end] = temp; 
        reverse(array, start+1, end-1); 
    } 
	}
		
		



