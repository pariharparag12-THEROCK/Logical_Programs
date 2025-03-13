package september1;

public class CountWhiteSpaceString {

	public static void main(String[] args) {
	
		String sentence	 = "Pu  ne ";
		
		int count = 0;
		
		for (int i=0; i<=sentence.length()-1; i++) {
			
			if (sentence.charAt(i)==' ') {
				
				count = count+1;
				 
			}
			
		}
		
		System.out.println(count);

	}

}
