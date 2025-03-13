package november8;

public class FirstCharacterOfEachWordAsUpperCase {

	public static void main(String[] args) {
		
		String sentence = "java and manual";
		
		System.out.println(sentence);
		System.out.println();
		
		String parts[] = sentence.split(" ");
		
		String newSentence = "";
		
		for (int i=0; i<=parts.length-1; i++) {
				
			String firstcharacter = parts[i].substring(0, 1);
			
			String remainingcharacters = parts[i].substring(1);
			
			newSentence = firstcharacter.toUpperCase()+remainingcharacters;
			
			System.out.print(newSentence+" ");
			
			newSentence = "";
			
		}
		
		
	}

}
