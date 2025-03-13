package november8;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		//int n = 371;
		
	//	Scanner orv = new Scanner(System.in);
		
	//	System.out.println("Enter a number");
	//	int n = orv.nextInt();
		
		for(int n=1; n<=1000; n++) {
			
			int temp =n;
			
			int s =0;
			
			int t;
			
			while(temp>0) {
				
				t = temp%10;
				
				s = t*t*t+s;
				
				temp=temp/10;
			}
			
			if (n==s) {
				System.out.println(s+" is armstrong number");
			}
			
			
		}
		

		
		//orv.close();
	}

}
