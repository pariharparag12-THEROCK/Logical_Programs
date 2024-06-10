package june4;

public class PallidromeString {

	public static void main(String[] args) {
		
		String word ="radar";
		
		String newString ="";

		
		for (int i=word.length()-1; i>=0; i--) {
			
			newString = newString + word.charAt(i);
			
			//newString ="";
			
		}
		
		if (word.equals(newString)) {
			
			System.out.println(newString +" given word is String");
		}
		
		else {
			System.out.println(newString + " given word is not String");
		}
	}

}
