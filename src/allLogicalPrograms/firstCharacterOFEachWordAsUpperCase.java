package allLogicalPrograms;



public class firstCharacterOFEachWordAsUpperCase {

	
	public static void main(String[]args) {
		
		String sentence = "java and manual";
		
		System.out.println(sentence);
		
		String	parts[]	 =	sentence.split(" ");
		
		
		String newSentence="";
		
		for (int i=0; i<=parts.length-1; i++) {
			
			String firstCharacter = parts[i].substring(0, 1);
			
			String remainingCharacters =	parts[i].substring(1);
			
			newSentence = newSentence + firstCharacter.toUpperCase() +remainingCharacters;
			
			System.out.print(newSentence +" ");
			
			newSentence="";
			
		}
		
		
		
		}
		
	
}
