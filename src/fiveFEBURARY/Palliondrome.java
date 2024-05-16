package fiveFEBURARY;

import java.util.Scanner;

public class Palliondrome {

	public static void main(String[] args) {
		
		//Number is said to be pallindrome that remains the same when its digits are reversed.
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n = orv.nextInt();
		
		int temp = n;
		
		int s=0;
		
		int t;
		
		while (temp>0) {
			
			t = temp%10;
			s = s*10+t;
			temp= temp/10;
		}

		System.out.println(s );
		
		if (n==s) {
			
			System.out.println(s + " Given number is Pallindrome");
		}
		
		
		else {
			System.out.println(s+ "Given number is not Pallindrome");
		}
		
		
		orv.close();
	}

}
