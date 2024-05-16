package sixteenmarch;

import java.util.Scanner;

public class Pangram {
				
	public static void main(String args[]) {
		
		// Pangram is a unique sentence in which a letter of every alpahbet is used at least once;
		
		String sentence;
		
		Scanner orv = new Scanner(System.in);
		
		sentence  = orv.nextLine();
		
		//String sentence = "The quick brown fox jumps over the lazy dog";
		
		String r = sentence.replaceAll(" ", "").toLowerCase();
		
		System.out.println(r);
		
		//char s[] =	r.toCharArray();
	
		String c = "";
		
		for (char i='a'; i<='z'; i++) {	
			
			if (r.indexOf(i)!= -1) {
				
				c =c+i;
			}
			
		}
		
		System.out.println(c.length());
		
		if (c.length()==26) {
			System.out.println( "Given String is Pangram");
		}
		
		else {
			System.out.println("Given String is not Pangram");
		}
		
		
		orv.close();
	}
}
