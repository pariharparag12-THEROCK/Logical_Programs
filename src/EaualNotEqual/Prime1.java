package EaualNotEqual;

import java.util.Scanner;

public class Prime1 {

	public static void main(String []args) {
		
		
		
	
		
		
		for (int n=2; n<=100; n++) {
		
		int temp =0;
			
			for (int i=2; i<=n-1; i++) {
				
				if (n%i==0) {
					
					temp=temp+1;
				}
			}
			
			if (temp ==0) {
				
				System.out.print(n +"is pp ");
			}
			
			
		
			
		}
		
		
		
	}
	
			
	
}
