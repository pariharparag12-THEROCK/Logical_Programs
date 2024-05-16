package fiveFEBURARY;

import java.util.Scanner;

public class Pangram {
	
	//Pangram is a unique sentence in which every letter of the alphabet is used at least once
	public static void main(String[]args) {
		
		String sentence;
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a Sentence");
		
		sentence = orv.nextLine();
		
		//String sentence = "The quick brown fox jumps over the lazy dog";
		
		String str	=	sentence.replaceAll(" ", "").toLowerCase();
		
		System.out.println(str);
		
		String s = "";
		
		for (char i='a'; i<='z'; i++) {
			
			if (str.indexOf(i)!=-1) {
				
				s = s+i;
			}
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
