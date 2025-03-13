package september1;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		
//		Scanner orv = new Scanner(System.in);
		
//		System.out.println("Enter a Number");
		
//		int n = orv.nextInt();
		
		for (int n=11; n<=1000; n++) {
		
		
				int temp =n;
				
				int s =0;
				
				int t;
				
				while (temp>0) {
					
					t = temp%10;
					
					s = s*10 +t;
					
					temp =temp/10;	
					
				}
				
				
				if (n==s) {
					System.out.print(s+ " ");
				}
				
				/*
				 * else { System.out.println("Number is not Pallindrome :"+ s); }
				 */
		}		

	}

}
