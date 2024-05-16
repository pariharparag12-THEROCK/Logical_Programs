package logical;

public class DuplicateCharacterArray {

	public static void main(String []args) {
		
		String name = "MAHESH BABU";
		
		char S[] =	name.toCharArray();
		
		for (int i=0; i<=S.length-1; i++) {
			for (int j=i+1; j<=S.length-1; j++) {
				
				if (S[i]==S[j] && i!=j) {
					System.out.println(S[j]);
				}
			}
		}
	}
}
