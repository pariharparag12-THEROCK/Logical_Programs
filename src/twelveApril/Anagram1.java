package twelveApril;

import java.util.Arrays;

public class Anagram1 {
			
	
	
	public static void main(String[]args) {
		
		String a = "care";
		
		String b = "race";
		
		
		char c[] =	 a.toCharArray();
		char d[] = 	 b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		System.out.println(c);
		System.out.println(d);
		
		if (Arrays.equals(c, d)) {
			System.out.println("Given Strings are Anagram");
		}
		else {
			System.out.println("Given Strings are not Anagram");
		}
	}
}
