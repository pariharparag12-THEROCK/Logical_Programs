package forteenJanuary;

public class String348 {

	
	
public static void main(String args[]) {
			
        
		String sentence = "India is my Country";
		
		String parts[] = sentence.split(" ");
		
		
		String reverse	= "";
		
		for (int i=0; i<=parts.length-4; i++ ) {
			
			String r =	parts[i];
			
			for (int j= r.length()-1; j>=0 ; j-- ) {
				
				reverse = reverse + r.charAt(j);
			}
			
			
			System.out.print(reverse + " ");
			
			reverse = "";
			
		}
		
		
		for (int i=1; i<=parts.length-1; i++) {
				
			System.out.print(parts[i] + " ");
		}
		
		
		
		
		
		
		
		
		
	}
}
