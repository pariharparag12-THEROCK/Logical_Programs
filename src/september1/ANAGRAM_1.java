package september1;

import java.util.Arrays;

public class ANAGRAM_1 {

	public static void main(String[] args) {
		
		String a = "race";
		
		String b = "care";
		
		char c[] = a.toCharArray();

		char d[] = b.toCharArray();
		
		Arrays.sort(c);
		
		Arrays.sort(d);
		
		
		if (Arrays.equals(c,d)) {
			
			System.out.println("The Given Strings are Anagram");
		}
		
		
		else {
			System.out.println("The Given Strings are not Anagram");
		}
	}

}
