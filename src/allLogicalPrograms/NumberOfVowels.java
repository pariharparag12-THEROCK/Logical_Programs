package allLogicalPrograms;

public class NumberOfVowels {

	public static void main(String[] args) {
		
		String sentence = "Life is a beautiful enjoys it";
		
		char s[]=sentence.toCharArray();
		
		//String newString="";
		
		int count = 0;
		
		for (int i=0; i<=sentence.length()-1; i++) {
			
	
			switch(s[i]) {
			
			case ('a'): System.out.print(s[i]+" ");  count++; break;
			
			case ('e'): System.out.print(s[i]+" ");  count++; break;
			
			case ('i'): System.out.print(s[i]+" ");  count++; break;
				
			case ('o'): System.out.print(s[i]+" ");  count++; break;
				
			case ('u'): System.out.print(s[i]+" ");  count++; break;
			
			default: break;
			
			}
			
		
		}
		
		System.out.println();
		
		System.out.println("Number of Vowels count : "+ count);

	}

}
