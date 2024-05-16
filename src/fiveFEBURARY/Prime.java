package fiveFEBURARY;

import java.util.Scanner;

public class Prime {

	
	public static void main(String[]args) {
		
		
		//Scanner orv = new Scanner(System.in);
		
		//System.out.println("Enter a Number");
		
		//int n =	orv.nextInt();
	   
			
			for (int n=2; n<=100; n++) {
			
			    int temp = 0;
			    
			    for (int i=2; i<=n-1; i++) {
				   
				   if(n%i==0) {
					   
					   temp=temp+1;
					   
				   }
			   }
			   
			   
			   if (temp==0) {
				   System.out.print (n+ " ");
				   
			   }
			   
//			   else {
//				   System.out.println(n+ " is not Prime Number");
//			   }
			    
			  // orv.close();
			}
	}	

}
