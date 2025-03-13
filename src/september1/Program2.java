package september1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a comment");
		String sentence = orv.nextLine();
		
		String parts[] = sentence.split(" ");
		
		for (int i=0; i<=parts.length-2; i++) {
			
			System.out.print(parts[i]+" ");
		}

		
		String str ="";
		
		for (int i=parts.length-1; i<=parts.length-1; i++) {
			
				String r =	parts[i];
				
				for (int j=0; j<=r.length()-1; j++) {
										
					str = str + r.charAt(j);
				}
				
				System.out.print(str+" ");
				
				str ="";
			
		}
		
		System.out.println();
		
		System.out.println(parts[parts.length-1].length( ));
		
		
	}

}
