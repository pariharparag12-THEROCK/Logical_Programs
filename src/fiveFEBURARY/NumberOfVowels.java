package fiveFEBURARY;

public class NumberOfVowels {
		
	
	public static void main(String[]args) {   
		
		
		String sentence = "Life is a beautiful enjoy it";
		
		char S[] =	sentence.toCharArray();
		
		int count = 0;
		
		String c = "";
		
		for (int i=0; i<=sentence.length()-1; i++) {
						
			switch (S[i]) {
			
				case('a') :
				case('e') :
				case('i') :	
				case('o') :	
				case('u') :	
								count++;
					System.out.print(S[i] +" ");
					
					//c = S[i] +" ";
				
								break;
				default : break;
			}
			
			
			//System.out.print(c);
			//c ="";
		}
		
		System.out.println(count);
		
		
		
	}
}
