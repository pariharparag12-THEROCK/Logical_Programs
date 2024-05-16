package may9;

public class REVERSESTRING2 {

	public static void main(String[]args) {
		
		
		String sentence ="the Sun is Brigting star";
		
		char s[] = sentence.toCharArray();
		
		String reverse ="";
		
		for (int i=sentence.length()-1; i>=0; i--) {
			
			
			reverse = reverse + s[i];
			
			System.out.print(reverse);
	
			reverse="";
		}
		
	}
}
