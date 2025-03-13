package september1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
	
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int number = orv.nextInt();
		
		if (number%2==0) {
			System.out.println(number + "is even number");
		}
		else {
			System.out.println(number + "is odd number");
		}
		
		

	}

}
