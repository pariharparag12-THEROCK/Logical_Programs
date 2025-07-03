package allLogicalPrograms;

import java.util.Scanner;

public class ChamberLain {

	
	public static int method1(String S) {
		
		
		String parts[] = S.split(" ");
		
		int count =0;
		
		for(int i=0; i<=parts.length-1; i++) {
			
			
			if (parts[i]!=null) {
				
				count = count+1;
			}
			
		}
		
		return count;
		
		
		
		
	}
	
	
	public static void main(String[]args) {
		
		
		Scanner orv = new Scanner(System.in);
		
		System.out.println("Enter a Sentence");
		
		//String S = orv.nextLine();
		
		//String S = "India is my Country";
		
		//System.out.println(method1(S));
		
		System.out.println(method1(orv.nextLine()));
		
		
		orv.close();
	}
}
