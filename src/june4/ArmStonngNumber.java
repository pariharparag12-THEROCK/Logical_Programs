package june4;

import java.util.Scanner;

public class ArmStonngNumber {

	public static void main(String[]args) {
		
		
		//Scanner orv  =new Scanner(System.in);
		
		//System.out.println("Enter a number");
		//int n=	orv.nextInt();
		
		
		for (int n=11; n<=1000; n++) {
		
		int temp = n;
		
		int s = 0;
		
		int t;
		
		while (temp>0) {
			
			
			t = temp%10;
			
			s = t*t*t+s;
			
			temp =temp/10;
		}
		
		
		if (n==s) {
			System.out.println(s + " ");
		}
		
//		else {
//			System.out.println(s + " number is not armstrong number");
//		}
		}
		
	}
}
