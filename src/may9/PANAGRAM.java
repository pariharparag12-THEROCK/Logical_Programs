package may9;

import java.util.Scanner;

public class PANAGRAM {

	public static void main(String[] args) {
		
		
		
		
		

		//String sentence = "The quick Brown fox jumps over the lazy dog";
		
		
		String sentence;
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		
		sentence = orv.nextLine();
			
		String word =	sentence.replaceAll(" ", "");
		
		String str =	word.toLowerCase();
		
		String s ="";
		
		for (char i='a'; i<='z'; i++) {
			
			if (str.indexOf(i)!=-1) {
				
				s=s+i;
			}
		}
		
		System.out.println(s);
		
		
		if (s.length()==26) {
			
			System.out.println("Sentence is Pangram" );
		}
		
		
		else {
			System.out.println("Sentence is not Pangram" );
		}
		
		
		orv.close();
	}

}
