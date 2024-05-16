package may9;

import java.util.Arrays;

import IFrameHandle.commonProperties;

public class ANAGRAM {

	public static void main(String[]args) {
		
		String a = "care";
		
		String b = "race";
		
		
		char c[] = a.toCharArray();
		
		char d[]=	b.toCharArray();
		
		Arrays.sort(c);
		
		Arrays.sort(d);
		
		if (Arrays.equals(c, d)) {
			
			System.out.println("Given Strings are Anagram");
		}
		
		else {
			
			System.out.println("Given Strings are not Anagram");
		}
	
	}
}
