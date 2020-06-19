package JavaFundamental_OptionalTask1_4;
import java.util.*;
public class JavaFundamental_OptionalTask1_4 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Greetings, purpose and instructions
		System.out.println ("Hello User,\nPurpose of this program is to give you \n"
				+ "a number in which the number of different digits is minimal. \nIf there"
				+ " are several such numbers, find the first one.\n");
		
		//get how many numbers user is going to input
		System.out.println ("How many numbers you going to input?:");
		int howMany = getHowMany ();
		
		System.out.println ("Please input "+howMany+" integers:");
		int [] data = new int [howMany];
		for (int i=0; i<howMany; i++) {
			//use static method for input
			data [i]= getNumbers ();
		}
		
		// convert integers to string
		String [] dataString = new String [howMany];
		for (int i=0; i<howMany; i++) {
			dataString [i]=String.valueOf(data[i]);
		}
		
		
		// convert string array to char array
		char [][] dataChar = new char [dataString.length][];
		for (int i=0; i < dataString.length;i++) {
			dataChar [i]=dataString[i].toCharArray();
		}
		
		int count=0;
		int [] duplicates=new int [dataString.length];
		//find duplicates
		for (int i=0; i <dataString.length;i++) {
			for(int j = 0; j < dataChar[i].length; j++) {  
				for(int k = j + 1; k < dataChar [i].length; k++) {  
					if(dataChar [i][j] == dataChar [i][k]) 
						count++;
                     }
             	}	
			duplicates [i]=count;
			count=0;
			}
		
		// find the maximum number of duplicates
		// and corresponding string data has minimal difference
		// of digits
		int dupMax = duplicates [0];
		String dataMin=dataString [0];
		for (int i=1; i < dataString.length; i++) {
			
			if ( dupMax < duplicates [i]) {
				dupMax = duplicates [i];
				dataMin= dataString [i];
			}
			
		}
		System.out.println ("Number with minimal number of different digits is :" + dataMin);
		
		//print out number with minimal 
		System.out.println ();
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
