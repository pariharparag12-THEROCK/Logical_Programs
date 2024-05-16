package sixteenmarch;

import java.util.Random;

public class RandomNumberGenerate {

	
	public static void main(String[]args) {
		
		
		Random orv = new Random();
		
		int number = orv.nextInt();
		
		System.out.println(number);
		
	}
}
