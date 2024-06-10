package june4;

public class Vowels4 {

	public static void main(String[] args) {
		
		String sentence = "life is good just enjoys it";
	
		char s[] = sentence.toCharArray();
		
		int count =0;

		System.out.println(" vowels are : ");
		
		for (int i=0; i<=s.length-1; i++) {
			
			switch(s[i]) {
			
				case('a') : System.out.print(s[i]+ " "); count++ ; break;
				case('e') : System.out.print(s[i]+ " "); count++ ; break;
				case('i') : System.out.print(s[i]+ " "); count++ ; break;
				case('o') : System.out.print(s[i]+ " "); count++ ; break;
				case('u') : System.out.print(s[i]+ " "); count++ ; break;
				default : break;
			
			}
				
		}
		
		
		System.out.println();
		
		System.out.println("Number of vowels is: "+ count);
	}

}
