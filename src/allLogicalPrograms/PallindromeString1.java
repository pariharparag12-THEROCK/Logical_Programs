package allLogicalPrograms;

public class PallindromeString1 {

	
	public static void main(String[]args) {
		
		String word = "radar";
		
		String newString="";
		
		for (int i=word.length()-1; i>=0; i--) {
			
			newString = newString +	word.charAt(i);
			
			//System.out.print(newString);
			
			//newString ="";
		}
		
		
		if (newString.equals(word)) {
			
			System.out.println(" Given String is Pallindrome String");
		}
		
		else {
			
			System.out.println(" Given String is not Pallindrome String");
		}
	}
}
