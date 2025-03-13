package november8;

public class ReverseString1 {

	public static void main(String[] args) {
		
		String sentence = "the Sun is Brigting star";
		
		/*
		 * for (int i=sentence.length()-1; i>=0; i--) {
		 * 
		 * System.out.print(sentence.charAt(i)); }
		 */
		
		String reverse ="";
		
		for (int i=sentence.length()-1; i>=0; i--) {
			
			reverse = reverse + sentence.charAt(i);
			
		}
		
	
		System.out.println(reverse);

	}

}
