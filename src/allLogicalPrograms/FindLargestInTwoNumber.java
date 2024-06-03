package allLogicalPrograms;

import java.util.Scanner;

public class FindLargestInTwoNumber {

	public static void main(String[] args) {
		
		
		Scanner orv = new Scanner(System.in);
		
		
		System.out.println("Enter a First Number");
		int num1 = orv.nextInt();
		
		System.out.println("Enter a Second Number");
		int num2 = orv.nextInt();
		
		
		if (num1>num2) {
			
			System.out.println(num1 + " is greater than "+ num2);
		}
		
		else if(num1<num2){
			System.out.println(num2 + " is greater than "+ num1);
		}
		
		else {
			
			System.out.println(num1 +" is equals to "+ num2);
		}
		
		
		orv.close();
	}

}
