package november8;

public class PallidromeString {

	public static void main(String[] args) {
		
		String word = "radar";
		
//		char S[] = word.toCharArray();
//		
//		String newString="";
//		
//		for(int i=S.length-1; i>=0; i--) {
//			
//			newString = newString +S[i];
//			
//		}
//		
//		System.out.println(newString);
//		
//		if (word.equals(newString)) {
//			
//			System.out.println("Given String is Pallidrome : "+newString);
//		}
//		
//		else { 
//			System.out.println("Given String is not Pallidrome : "+newString);
//		}
		
		
		
		String newString="";
		
		for(int i=word.length()-1; i>=0; i--) {
			
			newString = newString +word.charAt(i);
		}
		
		if (word.equals(newString)) {
			System.out.println("Given String is Pallindrome :"+newString);
		}
		
		else {
			System.out.println("Given String is not Pallindrome :"+newString);
		}
		

	}

}
