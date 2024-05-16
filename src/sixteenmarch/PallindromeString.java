package sixteenmarch;

public class PallindromeString {

	public static void main(String []args) {
		
		String word = "radar";
		
		char s[] = word.toCharArray();
		
		String newString = "";
		
	
		for(int i=s.length-1; i>=0; i--) {
			
			newString = newString + s[i];
			
		}
		
	System.out.println(newString);
		
		
		if (word.equals(newString)) {
			
			System.out.println(newString + " is pallindrome String");
		}
		
		else {
			System.out.println(newString + " is not pallindrome String");
		}
	}
}
