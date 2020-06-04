package JavaFundamentals_MainTask_1;

import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input your name and press enter");
		Scanner scanner= new Scanner (System.in);
		String name=scanner.nextLine();
		System.out.println("Hello, "+name+"!");
	}

}
