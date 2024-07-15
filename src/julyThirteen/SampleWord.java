package julyThirteen;

public class SampleWord {

	public static void main(String[] args) {
		

		String word = "Sample";
		
		char ch[]=word.toCharArray();
		
		for (int i=ch.length-1; i>=0; i--) {
			
			for (int j=0; j<=i; j++) {
				
				System.out.print(ch[j]);
			}
			
			System.out.println();
		}
 
	}

}
