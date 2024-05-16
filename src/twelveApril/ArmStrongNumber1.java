package twelveApril;

import java.util.Scanner;

public class ArmStrongNumber1 {

	public static void main(String[] args) {
	
		int n;
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		n = orv.nextInt();
		
		int temp = n;
		int s = 0;
		int t;
		
		while(temp>0) {
			
			t = temp%10;
			s = t*t*t +s;
			temp = temp/10;
			
		}
		
		if (n==s) {
			System.out.println("Given number is Arm Strong "+s);
		}
		
		else {
			System.out.println("Given number is not Arm Strong"+s);
		}

	}

}
