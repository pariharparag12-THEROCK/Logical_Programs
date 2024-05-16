package fiveFEBURARY;



import java.util.Arrays;

public class ANAGRAM {

	//we can say that two strings are anagrams if they contain the same characters but in a different order.
	public static void main( String[] args){
		
		String a = "race";
		String b = "care";
		
		char c[] = a.toCharArray();
		char d[] =  b.toCharArray();
		
		
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
