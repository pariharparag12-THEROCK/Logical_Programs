package allLogicalPrograms;

import java.util.Scanner;

public class ArmStrongNumber1 {

	public static void main(String[] args) {
	
		//int n;
		
		for (int n=11; n<=1000; n++) {
		
		//Scanner orv = new Scanner(System.in);
		
		//System.out.println("Enter a number");
		
		//n = orv.nextInt();
		
		int temp = n;
		int s = 0;
		int t;
		
		while(temp>0) {
			
			t = temp%10;
			s = t*t*t +s;
			temp = temp/10;
			
		}
		
		if (n==s) {
			System.out.print(s+" ");
		}
		
//		else {
//			System.out.println("Given number is not Arm Strong"+s);
//		}
		
		
		//orv.close();
		}

	}

}
