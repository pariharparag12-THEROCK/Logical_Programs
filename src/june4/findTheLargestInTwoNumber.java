package june4;

import java.util.Scanner;

public class findTheLargestInTwoNumber {

	public static void main(String[] args) {
		
		Scanner orv = new Scanner (System.in);
		
		System.out.println("Enter a first Number");
		
		int num1 = orv.nextInt();
		
		
		System.out.print("Enter a scecond Number");

		
		int num2= orv.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+" is greater ");
		}
		
		else if (num1<num2) {
			System.out.println(num1+" is smaller ");
		}
		
		else {
			
			System.out.println(num1+" and  "+ num2+" are equal");
		}
		
		
	}

}
