package vishal;


public class PallidromeString {

	public static void main(String[]args){
		
		String word = "Madam";
		
		String reverse ="";
		
		for (int i=word.length()-1; i>=0; i--) {
			
			reverse = reverse + word.charAt(i);
		}
		
		if (reverse.equalsIgnoreCase(word)) {
			
			System.out.println("Given String is Pallindrome");
		}
		
		else {
			System.out.println("Given String is not Pallindrome");
		}
	}
}
