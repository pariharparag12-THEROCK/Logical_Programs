package logical;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[]args) {
		
		int a;
		
		Scanner orv = new Scanner (System.in);
		
		System.out.println("Enter a Number");
		
		a = orv.nextInt();
		
		
		
		if(a%2==0) {
			System.out.println("a is even number");
		}
		
		else {
			System.out.println("a is odd number");
		}
		
		orv.close();
		
		
	}

}
