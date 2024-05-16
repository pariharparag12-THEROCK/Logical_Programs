package EaualNotEqual;

import java.util.Scanner;

public class OddEven {

	public static void main(String []args) {
		
		
		
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int n = orv.nextInt();
		
		if (n%2==0) {
			
			System.out.println( n + " is Even Number");
		}
		
		else {
			System.out.println( n + " is odd Number");
		}
		
		orv.close();
	}
}
