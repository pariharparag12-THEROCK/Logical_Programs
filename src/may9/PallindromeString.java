package may9;

public class PallindromeString {

	public static void main(String[]args) {
		
		String word = "radar";
		
		String reverse ="";
		
		for (int i=word.length()-1; i>=0; i--) {
			
			 reverse	=	reverse + word.charAt(i);
		}
		
		if (word.equals(reverse)) {
			
			System.out.println("Word is pallindrome : " +reverse );
		}
		
		else {
			System.out.println("Word is not pallindrome : " +reverse );
		}
	}
}
