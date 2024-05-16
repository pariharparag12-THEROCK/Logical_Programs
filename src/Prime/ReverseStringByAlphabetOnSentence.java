package Prime;

public class ReverseStringByAlphabetOnSentence {

	public static void main(String []args) {
		
		String sentence = "The Sun is a rising star";
		
		char S[] =	sentence.toCharArray();
		
		int length = S.length;
		
		String reverse = "";
		
		for (int i=length-1; i>=0; i--) {
			
			reverse = reverse + S[i];
		}
		
		System.out.println(reverse);
	}
}
