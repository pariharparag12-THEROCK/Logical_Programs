package june4;

import java.util.Scanner;

public class PROGRAM2 {

	public static void main(String[] args) {
		
		String sentence = "Life is a beautiful enjoys";
		
		String parts[]	= sentence.split(" ");
		
		String reverse ="";
		
		
		Scanner orv = new Scanner (System.in);
		
		System.out.println("Enter a Word");
		String lastword	=	orv.nextLine();
		
		String lastword1[] = lastword.split("");
		
		for (int i=0; i<=parts.length-1; i++) {
			
			System.out.print(parts[i]+ " ");
		}
		
		
		int count = 0;
		
		for (int i=0; i<=lastword1.length-1; i++) {
			
			System.out.print(lastword1[i]);
			
			count =count+1;
		}
		
		
		System.out.println();
		
		System.out.println("count is : " + count);
		
		orv.close();
	}

}
