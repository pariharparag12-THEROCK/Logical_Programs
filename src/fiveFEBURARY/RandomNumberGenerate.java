package fiveFEBURARY;

import java.util.Random;

public class RandomNumberGenerate {

	
	public static void main(String[]args) {
		
		Random orv = new Random();
		
		int n =	orv.nextInt();
		
		System.out.println(n);
	}
}
