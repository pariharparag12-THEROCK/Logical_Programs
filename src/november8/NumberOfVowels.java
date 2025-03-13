package november8;

public class NumberOfVowels {

	public static void main(String[] args) {
		
		
		String sentence = "Life is a beautiful enjoys it";
		
		System.out.println(sentence);
		
		char S[] = sentence.toLowerCase().toCharArray();
		
		int count =0;
		
		for (int i=0; i<=S.length-1; i++) {
			
			
			switch(S[i]) {
			
				case('a'): System.out.print(S[i]+" "); count++; break;
				case('e'): System.out.print(S[i]+" "); count++; break;
				case('i'): System.out.print(S[i]+" "); count++; break;
				case('o'): System.out.print(S[i]+" "); count++; break;
				case('u'): System.out.print(S[i]+" "); count++; break;
				default: 										break;
			
			}
		}
		
		System.out.println();
		
		System.out.println("The number of Vowels present is: "+ count);

	}

}
