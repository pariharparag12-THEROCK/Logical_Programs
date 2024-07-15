package julyThirteen;

public class NumberOfVowelsCount {

	public static void main(String[] args) {
		
		String sentence = "Life is a beautiful enjoys it";
		
		char S[] = sentence.toCharArray();

		int count =0;
		
		for (int i=0; i<=S.length-1; i++) {
			
			
			switch(S[i]) {
			
				case ('a') : System.out.print(S[i]+" "); count++ ;  break;
				case ('e') : System.out.print(S[i]+" "); count++ ;  break;
				case ('i') : System.out.print(S[i]+" "); count++ ;  break;
				case ('o') : System.out.print(S[i]+" "); count++ ;  break;
				case ('u') : System.out.print(S[i]+" "); count++ ;  break;
			
				default : break;
			
			}
			
		}
		
		System.out.println();
		
		System.out.println(count);
		
		
	}

}
