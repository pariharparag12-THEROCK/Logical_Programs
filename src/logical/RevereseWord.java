package logical;

public class RevereseWord {

	public static void main(String[]args) {
		
		
		String name = "The Sun is a Brightning star";
		
		char S[] =	name.toCharArray();
		
		int length = S.length;
		
		System.out.println(length);
		
		String reverse = "";
		
		for (int i =length-1; i>=0; i--) {
			
			reverse = reverse + S[i];
		}
		
		System.out.println(reverse);
	}
}
