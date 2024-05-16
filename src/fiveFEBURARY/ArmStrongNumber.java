package fiveFEBURARY;

import java.util.Scanner;

public class ArmStrongNumber {

	// ARmStrong Number --It is number in which the sum of each digits of power raised is equal to the number itself.
	
	public static void main(String[]args) {
		
	
		
		Scanner orv = new Scanner(System.in);
		
		System.out.print("Enter a Number");
		
		int n = orv.nextInt();
		
		int temp = n;
		
		int s = 0;
		
		int t;
		
		while(temp>0) {
			
			
			t = temp%10;
			s = t*t*t + s;
			temp = temp/10;
		}
		
		
		if (n==s) {
			System.out.println(n + " is ArmStrong Number");
		}
		
		else {
			System.out.println(n + " is not ArmStrong Number");
		}
		orv.close();
	}
}
