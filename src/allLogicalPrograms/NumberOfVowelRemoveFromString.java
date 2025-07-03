package allLogicalPrograms;

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
		
		
		
		System.out.println();
		
		
		String sentence1 = "life is a beautiful enjoys it";
	    
	    char S[]  =  sentence1.toCharArray();
	    
	    for (int i=0; i<=S.length-1; i++){
	        
	        if(S[i]=='a' || S[i]=='e' || S[i]=='i' || S[i]=='o' || S[i]=='u'){
	            
	            continue;
	        }
	        
	        else{
	            System.out.print(S[i]+" ");
	            
	        }
	        
	        
	        
	    }
		
	

		
	}
	
	

}
