package november8;

import java.util.Scanner;

public class FindTheLargestInTwoNumbers {

	public static void main(String[] args) {
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a First  Number");
		int num1 = orv.nextInt();
		
		System.out.println("Enter a Second  Number");
		int num2 = orv.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+" is greater than "+ num2);
		}
		
		else if (num1<num2) {
			System.out.println(num1+" is Smaller than "+ num2);
		}
		
		else {
			System.out.println(num1+" is equal to "+ num2);
		}
		
		orv.close();

	}

}
