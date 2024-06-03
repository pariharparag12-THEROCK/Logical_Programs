package allLogicalPrograms;

public class NoOfVowels {

	
	
	
	public static void main(String[] args) {
		
		String sentence = "beautiful";
		
		char S[] =	sentence.toCharArray();
		
		int count = 0;
		
		for(int i=0; i<=S.length-1; i++) {
			
			switch(S[i]){
				
			case ('a'):
			case ('e'):	
			case ('i'):	
			case ('o'):
			case ('u'):	
			
				count++;
				break;
				
			default: break;
			}
			
		}
		System.out.println(count);
		
		System.out.println();
		
		
		
		
		
		
		
		
		String c = "";
		
		for(int i=0; i<=S.length-1; i++) {
			
			switch(S[i]) {
				
			case('a'): 
			case('e'): 
			case('i'): 
			case('o'): 
			case('u'): 
				
					c = S[i] +" "; 
					break;
					
			default: break;	
			}
			
			System.out.print(c);
			
			c ="";
							
		}
		
		
		/*String sentence = "Life is a beautiful enjoys it";
		
		char S[] =	sentence.toCharArray();
		
		int count = 0;

		String c = "";
		
		for(int i=0 ; i<=S.length-1; i++) {
			
			switch(S[i]) {
				
				case('a'):  c = S[i] +" "; count++ ; break;
				case('e'):  c = S[i] +" "; count++ ; break;
				case('i'):	c = S[i] +" "; count++ ; break;
				case('o'):	c = S[i] +" "; count++ ; break;
				case('u'):  c = S[i] +" "; count++ ; break;
				
				default : break;	
					
					
			}
			
			System.out.print(c);
			c= "";
			
		}
		
		System.out.println("\n" + "Number of vowels count in sentence is: " +count);
	
		

	}
		*/
		
		
	}
	
}
