package may9;

public class FIRSTCHARACTEREACHWORDUPPERCASE {

	public static void main(String[] args) {
		
		String sentence = "java and manual";
		
		System.out.println(sentence);
		
		String parts[] = sentence.split(" ");
		
	
		String newString;
		
		for (int i=0; i<=parts.length-1; i++) {
			
			String firstcharacter =	parts[i].substring(0, 1);
				
			String	remainingcharacters	 =	parts[i].substring(1);
			
		
			
			newString = firstcharacter.toUpperCase() + remainingcharacters;
			
			
				
				System.out.print(newString +" ");
				
		
			
			newString = "";
			
		}

	}

}
