package november8;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		int number;
		
		Scanner orv = new Scanner(System.in);		
		
		System.out.println("Enter a Number");
		number = orv.nextInt();
		
		
		if (number%2==0) {
			
			System.out.println("Number is Even");
		}
		
		else {
			
			System.out.println("Number is Odd");
		}
		
		orv.close();

	}

}
