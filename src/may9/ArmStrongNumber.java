package may9;

import java.util.Scanner;

public class ArmStrongNumber {
	
	public static void main (String []args) {
		
		
		for (int i=0; i<=1000; i++) {
		
		int n = i;
		
		//Scanner orv = new  Scanner(System.in);
		
		//System.out.println("Enter a number");
		
		//n = orv.nextInt();
		
		int temp = n;
		
		int s =0;
		
		int t;
		
		while (temp>0) {
			
			t = temp%10;
			
			s = t*t*t+s;
			
			temp = temp/10;	
			
		}
		
		
		if (n==s) {
			
			System.out.println("Number is AremStrong "+ s);
		}
		
//		else {
//			
//			System.out.println("Number is not AremStrong "+ s);
//		}
		
		
		//orv.close();
		}
	}
	
}
