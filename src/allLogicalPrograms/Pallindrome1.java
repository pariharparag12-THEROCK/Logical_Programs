package allLogicalPrograms;

import java.util.Scanner;

public class Pallindrome1 {
			
	public static void main(String []args) {
		
		//int n;
		
		//Scanner orv =  new Scanner(System.in);
		
		//System.out.println("Enter a number");
		
		//n =  orv.nextInt();
		
		for (int n=11; n<=1000; n++) {
			
		
				int temp = n;
				
				int s =0;
				
				int t;
				
				while (temp>0) {
					
					
					t = temp%10;
					
					s = s*10 +t;
					
					temp =temp/10;
					
					
				}
				
				
				if (n==s) {
					
					System.out.print(n+ " ");
				}
				
		//		else {
		//			
		//			System.out.println("number is not pallindrome");
		//		}
		
		}
	}

	
	
}
