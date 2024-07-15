package julyThirteen;

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
		
		if(Arrays.equals(c,d)) {
			
			System.out.println("Given String are Anagram");
		}
		
		else {
			System.out.println("Given String are not Anagram");
		}
	}

}
