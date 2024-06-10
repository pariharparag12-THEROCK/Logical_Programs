package june4;

import java.util.Scanner;

public class PallidromeNumber {

	public static void main(String[] args) {
		
//		Scanner orv = new Scanner(System.in);
//		
//		
//		System.out.println("Enter a number");
//		
//		int n = orv.nextInt();
		
		int count=0;
		for (int n=11; n<=1000; n++) {
			
			
					int temp =n;
					
					int s =0;
					
					int t;
					
					
					
					while (temp>0) {
						
						t =temp%10;
						s= s*10+t;
						temp =temp/10;
					}
					
					if (n==s) {
						System.out.print(s +" ");
						count++;
					}
		
//		else {
//			System.out.println(s + " number is not pallindrome");
//		}
		}	
		
		System.out.println();
		System.out.println(" Number of pallindrome number upto 1000 is :" +count );
	}

}
