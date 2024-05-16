package EaualNotEqual;

import java.util.Scanner;

public class PallinDrome {

	public static void main(String []args) {
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int n = orv.nextInt();
		
		
		int temp = n;
		
		int s= 0;
		
		int t;
		
		
		while(temp>0) {
			
			
			t = temp%10;
			
			s = s*10 +t;
			
			temp =temp/10;
			
			
		}
		
		if (n==s) {
			
			System.out.println(n + " is pallidrome numebr");
		}
		
		
		else {
			System.out.println(n + " is not pallidrome numebr");
		}
		
		orv.close();
	}
}
