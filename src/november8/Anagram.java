package november8;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String a = "care";
		String b = "race";
		
		char c[] = a.toCharArray();
		char d[] = b.toCharArray();
		
		
		Arrays.sort(c);
		Arrays.sort(d);
		
		
		System.out.println(c);
		System.out.println(d);
		
		
		if (Arrays.equals(c,d)) {
			System.out.println("The two given sentences are anagram");
		}
		
		else {
			System.out.println("The two given sentences are not anagram");
		}

	}

}
