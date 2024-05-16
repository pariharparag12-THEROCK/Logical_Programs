package twelveApril;

public class NumberOfVowelRemoveFromString {

	public static void main(String[] args) {
		
		String sentence = "MumbaI";
		
		String s ="";
		
		for (int i=0; i<=sentence.length()-1; i++) {
			
			char c	=	sentence.charAt(i);
			
			if(c=='a' || c=='e' || c=='I' || c=='o' || c=='u') {
				
				continue;
				
			}
			
			
			s=s+c;
		}
		
		
		System.out.println(sentence);
		System.out.println(s);
		System.out.println(s.length());
		
	}

}
