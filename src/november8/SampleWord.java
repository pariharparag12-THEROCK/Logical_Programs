package november8;

public class SampleWord {

	public static void main(String[] args) {
		
		String s ="Sample";
		
		char ch[] = s.toCharArray();
		
		
		
		for (int i=ch.length-1; i>=0; i--) {
			
			
			for(int j=0; j<=i; j++) {
				
				System.out.print(ch[j]);
			}
			
			System.out.println();
		}
	}

}
