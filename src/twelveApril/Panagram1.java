package twelveApril;

import java.util.Scanner;

public class Panagram1 {

	public static void main(String[] args) {
		
		//String sentence = "The quick Brown fox jumps over the lazy dog";
		
		String sentence;
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a Sentence");
		
		sentence =	orv.nextLine();
	
		String newSentence =	sentence.replaceAll(" ", "");
		
		String str =  newSentence.toLowerCase();
		
		String s = "";
		
		for (char i='a'; i<='z'; i++) {
			
			
			if (str.indexOf(i)!=-1) {
				
				s =s+i;
				
			}
		
			//System.out.println(s);

		}
		
		
		if (s.length()==26) {
			
			System.out.println("Given String is Pangram");
		}
		
		else {
			System.out.println("Given String is not Pangram");
		}
		
		
		
		orv.close();
	}
		
			

}
