package EaualNotEqual;

import java.util.Scanner;

public class Factorial {

	public static void main(String []args) {
		
		
		
		
		Scanner orv = new Scanner(System.in);
		
		
		System.out.println("Enter a number");
		
		int n = orv.nextInt();
		
		int fact =1;
		
		for(int i=1; i<=n; i++) {
			
			fact = fact*i;
		}
		
		System.out.println(fact);
		
	}
}
