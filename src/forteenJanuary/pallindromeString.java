package forteenJanuary;

import java.util.Scanner;

public class pallindromeString {

	public static void main(String []args) {
		
		
		String word = "radar";
		
		String reverse ="";
		
		for (int i=word.length()-1; i>=0; i--) {
			
			reverse = reverse + word.charAt(i);
		}
		
		
		if (word.equals(reverse)) {
			
			System.out.println(reverse + " Given String is Pallindrome");
		}
		
		else {
			
			System.out.println(reverse + " Given String is not Pallindrome");
		}
	}
}
