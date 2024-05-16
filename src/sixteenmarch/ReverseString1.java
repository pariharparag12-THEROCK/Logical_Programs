package sixteenmarch;

public class ReverseString1 {

	public static void main(String[] args) {
		
		
		String sentence = "The Sun is a brighting star";
		
		String reverse = "";
		
		for (int i=sentence.length()-1; i>=0 ; i--) {
			
			reverse = reverse + sentence.charAt(i);
			
			System.out.print(reverse);
			
			reverse ="";
		}
		
		//System.out.println(reverse);
 
	}

}
