package june4;

public class ReverseString2 {

	public static void main(String[] args) {
		
		String sentence ="The Sun is a brightning star";
		
		char S[] = sentence.toCharArray();
		
		String reverse = "";
		
		for (int i=S.length-1; i>=0;i--) {
			
			reverse =reverse +	S[i];
			
			System.out.print(reverse);
			
			reverse ="";
		}

		
	
	}

}
