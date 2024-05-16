package forteenJanuary;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts;


public class RevSTRNG3 {

	public static void main(String []args) {
		
		String sentence = "Life is a beautiful enjoy it";
		
		String parts[] = sentence.split(" ");
		
		for (int i=parts.length-1; i>=0; i--) {
			
			System.out.print(parts[i] + " ");
		}
	}
}
