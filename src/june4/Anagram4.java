package june4;

import java.util.Arrays;

public class Anagram4 {

	public static void main(String[] args) {
		
		String a = "race";
		
		String b = "care";
		
		char c[] =	a.toCharArray();
		
		char d[] =	b.toCharArray();
		
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		System.out.println(c);
		System.out.println(d);
		
		if (Arrays.equals(c, d)) {
			
			System.out.println("Given String are Anagram");
		}
		
		else {
			System.out.println("Given String are not Anagram");
		}
	}

}
