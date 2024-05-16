package sixteenmarch;



public class PallindromeStringAnotherWay {

	public static void main(String[] args) {
		 
		String word = "radar";
		
		String reveresed = "";
		
		for (int i = word.length()-1; i>=0; i--) {
			
			reveresed = reveresed + word.charAt(i);
			
		}
		
		System.out.println(reveresed);
		
		if (word.equals(reveresed)) {
			System.out.println(reveresed +" is pallidrome String");
		}
		
		else {
			
			System.out.println(reveresed +" is  not pallidrome String");
		}

	}

}
