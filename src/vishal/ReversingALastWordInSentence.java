package vishal;

public class ReversingALastWordInSentence {

	public static void main(String[] args) {
		
		String sentence = "I really love you";
		
		String parts[]	= sentence.split(" ");
		
		String reverse = "" ;
		
		for (int i=0; i<=parts.length-2; i++) { // Outer loop used for spiltted number
			
			
			
			String r = parts[i];
			
			for (int j=r.length()-1; j>=0; j--) { // inner loop used for reversing alphabets
				
				reverse = reverse + r.charAt(j);
			}
			
			System.out.print(reverse +" ");
			
			reverse = "";
						
		}
		
		
		System.out.print(parts[parts.length-1]);
		
	}
}
