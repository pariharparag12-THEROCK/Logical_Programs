package september1;

public class PallindromeString {

	public static void main(String[] args) {
		
		String word = "radar";
		
		String newString="";
		
		for(int i=word.length()-1; i>=0; i--) {
			
			newString = newString + word.charAt(i);
		}	
		
		
			System.out.print(newString);
			
			

		
		System.out.println();
		
		if (word.equals(newString)) {
			
			System.out.println("Word is Pallindrome String : "+newString);
		}
		
		else {
			
			System.out.println("Word is not Pallindrome String: "+newString);
		}

	}

}
