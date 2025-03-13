package september1;

public class SampleWord {

	public static void main(String[] args) {
		
		String s ="Sample";
		
		char S[] = s.toCharArray();
			
		for (int i=S.length-1; i>=0; i--) {
			
			for (int j=0; j<=i; j++) {
				
				System.out.print(S[j]);
			}
			
			System.out.println();
		}
		
	

	}

}
