package allLogicalPrograms;

public class NumberOfVowelsInString {

	public static void main (String []args) {
		
		String sentence = "Life is a beautiful enjoys it";
		
		System.out.println(sentence);
		
		char S[] = sentence.toCharArray();
		
		int count =0;
		
		for (int i=0; i<=sentence.length()-1; i++) {
			
			
			
			String c ="";
			
			switch (S[i]) {
			
				case ('a') :   c = S[i] +" ";   count++ ; break;
				case ('e') :   c = S[i] +" ";   count++ ; break;
				case ('i') :   c = S[i] +" ";   count++ ; break;
				case ('o') :   c = S[i] +" ";   count++ ; break;
				case ('u') :   c = S[i] +" ";   count++ ; break;
				
				default: 									break;
				
			
				
			}
			
			System.out.print(c);
			
			c = "";
			
		
			
		}
		
		System.out.println();
		System.out.println(count);
		
		
	}
}
