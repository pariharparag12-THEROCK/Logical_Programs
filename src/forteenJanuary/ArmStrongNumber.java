package forteenJanuary;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String []args) {
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int n  = orv.nextInt();
		
		int temp =n;
		
		int s =0;
		
		int t;
		
		while(temp>0) {
			
			t = temp%10;
			
			s = t*t*t+s;
			
			temp = temp/10;
			
		}
		
		
		if (n==s) {
			
			System.out.println(n + " is  the ArmStrong Number");
		}
		
		
		else {
			
			System.out.println(n + " is not  the ArmStrong Number");
		}	
		
		orv.close();
		
	}
}
