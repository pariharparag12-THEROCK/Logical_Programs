package EaualNotEqual;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts;


public class RevSTRNG1 {

	public static void main(String []args) {
		
		String sentence = "India is My Country";
		
		String parts[]	= sentence.split(" ");
		
		System.out.print(parts[0] + " ");
	
		String reverse = "";
		
		for(int i=1; i<=parts.length-2; i++) {
			
			String r = parts[i];
			
			for(int j=r.length()-1; j>=0; j--) {
				
				reverse = reverse + r.charAt(j);
				
			}
			
			System.out.print(reverse +" ");
			reverse = "";
			
		}
		
		System.out.print(parts[parts.length-1]);
		
	}
}
