package logical;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main (String[]args) {
		
		int n;
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		n = orv.nextInt();
		
		int temp = n;
		
		int s =0;
		
		int t;
		
		
		while(temp>0) {
			
			t = temp%10;
			s = s*10+t;
			temp =temp/10;
			
		}
		
		if (n==s) {		
			System.out.println(n +" is Pallindrome Number");
		}
		
		else {
			System.out.println(n +" is not Pallindrome Number");
		}
		
		orv.close();
		
		
		
	}
	
}
