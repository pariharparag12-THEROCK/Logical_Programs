package logical;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String []args) {
		
		int n ;
		
		Scanner orv = new Scanner (System.in);
		
		System.out.println("Enter a number");
		
		n =orv.nextInt();
		
		int temp =n;
		int s = 0;
		int t;
		
		while(temp>0) {
			
			t=temp%10;
			s = t*t*t+s;
			temp =temp/10;
		}
		
		if(n==s) {
		System.out.println(n+ " is arm strong number");
		}
		
		else {
			System.out.println(n+ " is not arm strong number");
		}
		
		orv.close();
	}
}
