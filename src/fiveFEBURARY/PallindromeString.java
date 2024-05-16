package fiveFEBURARY;

public class PallindromeString {

	public static void main(String[]args) {
		
		String word = "radar";
		
		String reversed = "";
		
		for (int i=word.length()-1; i>=0; i--) {
			
			reversed = reversed + word.charAt(i);
		}
		
	//	System.out.println(reversed);
		
		
		if (word.equals(reversed)) {
			System.out.println(reversed +" Word is Pallidrome String");
		}
		
		else {
			System.out.println(reversed +" Word is not Pallidrome String");
		}
		
	}
}
