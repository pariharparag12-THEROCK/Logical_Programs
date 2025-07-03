package allLogicalPrograms;

import java.util.Scanner;

public class OddEven1 {
		
	public static void main(String[]args) {
		
		
		int n;
		
		Scanner orv =  new Scanner (System.in);
		
		System.out.println("Enter a number");
		
		n = orv.nextInt();
		
		if (n%2==0) {
			
			System.out.println(n +" the number is even number");	
		}
		
		else {
			
			System.out.println(n +" the number is odd number");
		}
		
		orv.close();
		
	}
}
