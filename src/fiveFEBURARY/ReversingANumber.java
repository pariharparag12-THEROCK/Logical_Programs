package fiveFEBURARY;

import java.util.Scanner;

public class ReversingANumber {

	
	public static void main(String []args) {
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		
		int n =	orv.nextInt();
		
		int temp = n;
		
		int s=0;
		
		int t;
		
		while (temp>0) {
			
			t = temp%10;
			s = s*10+t;
			temp=temp/10;
		}
		
		System.out.println(s);
		
		orv.close();
	}
}
