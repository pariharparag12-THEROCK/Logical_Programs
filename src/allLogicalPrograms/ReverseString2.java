package allLogicalPrograms;

public class ReverseString2 {
		
	
	public static void main(String[]args) {
		
		String sentence = "the Sun is Brigting star";
		
		char S[] =	sentence.toCharArray();
		
		String reverse = "";
		
		for (int i=sentence.length()-1; i>=0; i--) {
			
			reverse = reverse + S[i];
			
			System.out.print(reverse);
			
			reverse ="";
		}
		
		
 	}
}
