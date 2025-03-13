package september1;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		for (int n=1; n<=1000; n++) {
		
//		Scanner orv  = new Scanner(System.in);
		
//		System.out.println("Enter a number");
//		int n = orv.nextInt();
		
		//int n= 371;
		
		int temp = n;
		
		int s = 0;
		
		int t;
		
		while (temp>0) {
			
			
			t = temp%10;
			
			s = t*t*t +s;
			
			temp=temp/10;
			
			
		}
		
		
		
		if (n==s) {
			
//			System.out.println("Number is ArmStrong" + s);
			System.out.print(n +" ");
		}
		
//		else {
//			System.out.println("Number is not ArmStrong" + s);
//		}
//		
//		orv.close();
		
	}
		
	}	

}
