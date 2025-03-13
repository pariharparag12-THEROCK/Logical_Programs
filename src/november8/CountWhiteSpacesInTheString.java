package november8;

public class CountWhiteSpacesInTheString {

	public static void main(String[] args) {
		
		String sentence	 = "Pu  ne ";
		
		int s = 0;
		
		for (int i=0; i<=sentence.length()-1; i++) {
			
			if (sentence.charAt(i)==' ') {
				
				s=s+1;
			}
		}
		
		
		System.out.println("The number of spaces in the string is : "+s);

	}

}
