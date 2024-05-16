package sixteenmarch;



public class FirstCharacterOFEachWORDUpperCASE {

	public static void main(String[] args) {
		
		String sentence = "java and manual";
		
		String parts[] = sentence.split(" ");

		String newString = "";
		
		for (int i=0; i<=parts.length-1; i++) {
			
			String 	firstCharacter = parts[i].substring(0, 1);
			
			String remainingCharacters = parts[i].substring(1);
			
			newString = newString + firstCharacter.toUpperCase() + remainingCharacters;
				
			System.out.print(newString +" ");
			
			newString = "";
		}
		
	}

}
