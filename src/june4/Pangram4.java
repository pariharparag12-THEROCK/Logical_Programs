package june4;

public class Pangram4 {

	public static void main(String[] args) {
		
		String sentence = "The quick Brown fox jumps over the lazy dog";
		
		String Str	=	sentence.toLowerCase().replaceAll(" ", "");
		
		String s ="";
		
		for (char i='a'; i<='z'; i++) {
			
			if (Str.indexOf(i)!= -1) {
				
				s = s+i;
			}
	
		}
		
		if (s.length()==26) {
			System.out.println("Given String is Pangram : "+ "\n"+ Str + " : "+ s.length());
		}
		
		else {
			
			System.out.println("Given String is not Pangram : "+ "\n"+ Str + " : "+ s.length());
		}

	}

}
