package fiveFEBURARY;

import java.util.Scanner;

public class Factorial {

	
	public static void main(String args[]) {
		
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int n =	orv.nextInt();
		
		
		for (int j=1; j<=n; j++) {
		
		
				int fact=1;
			
				for (int i=1; i<=j; i++) {
					
					fact = fact*i;
				}
				
				System.out.print(fact +" ");
				
				}
		orv.close();
		}
	
		
	
	
}
