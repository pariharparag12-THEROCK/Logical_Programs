package september1;

import java.util.Scanner;

public class FindTheLargestInTwoNumbers {

	public static void main(String[] args) {
		
		Scanner orv  = new Scanner(System.in);
		
		System.out.println("Enter a number1");
		int num1 = orv.nextInt();
		
		System.out.println("Enter a number2");
		int num2 = orv.nextInt();
		
		if (num1>num2) {
			System.out.println(num1 + "is the greater number");
		}
		
		else if(num1<num2) {
			System.out.println(num2 + "is the greater number");
		}
		
		else {
			System.out.println(num1 + " and "+ num2 +" are equal");
		}
		
	}

}
