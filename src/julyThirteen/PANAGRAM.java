package julyThirteen;

public class PANAGRAM {

	public static void main(String[] args) {
		
		String sentence = "The quick brown fox jumps over the lazy dog";
							
		
		String S  =  sentence.toLowerCase();
		
		String  newString = S.replaceAll(" ", "");
		
		String s = "";
		
		for (char i='a'; i<='z'; i++) {
			
			if (newString.indexOf(i)!=-1) {
				
				s = s+i;
			}
		}
		
		
		if (s.length()==26) {
			System.out.println("Given String is PanAgram");
		}
		
		else {
			System.out.println("Given String is not PanAgram");
		}

	}

}
