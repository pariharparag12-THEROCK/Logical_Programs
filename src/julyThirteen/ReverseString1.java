package julyThirteen;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		
		Scanner orv = new Scanner (System.in);
		
		System.out.println("Enter a sentence");
		
		String sentence = orv.nextLine();
		
		
		String parts[] = sentence.split(" ");
		
		String reverse = "";
		
		for (int i=0; i<=parts.length-2; i++) {
			
			System.out.print(parts[i]+" ");
			
		}
		
		for (int i=parts.length-1; i<=parts.length-1; i++) {
			
			
			String r = parts[i];
			
			for (int j=0; j<=r.length()-1; j++) {
				
				reverse = reverse + r.charAt(j);
				
			}
			
			System.out.print(reverse + " ");
			
			reverse ="";
			
		}
		
		
		System.out.println();
				
		System.out.println(parts[parts.length-1].length());
		
		orv.close();
	}

}
