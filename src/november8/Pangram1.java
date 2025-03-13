package november8;

import java.util.Scanner;

public class Pangram1 {

	public static void main(String[] args) {
		
		
		//String sentence = "The quick Brown fox jumps over the lazy dog";
		
		Scanner orv =new Scanner(System.in);
		
		System.out.println("Enter a Sentence");
		
		String sentence = orv.nextLine();		
		
		String sentence1 = sentence.toLowerCase();
		
		String newString = sentence1.replaceAll(" ", "");	
		
		System.out.println(newString);
		
		String S = "";
		
		int count =0;
		
		for (char i='a'; i<='z'; i++) {
			
			if (newString.indexOf(i)!=-1) {
				
				S=S+i;
				
				count=count+1;
			}
		}
		
		if (S.length()==26) {
			System.out.println("The Given String is Pangram : "+S+" and count is : "+count);
		}
		
		else {
			System.out.println("The Given String is not Pangram : "+S+" and count is : "+count);
		}
		
		orv.close();

	}

}
