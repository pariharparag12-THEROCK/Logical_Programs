package fiveFEBURARY;

public class FirstCharacterEachWordUpperCase {

	
	public static void main(String []args) {
		
		String sentence = "java and manual";
		
		String part[] =	sentence.split(" ");
		
		
		String newStringSen = "";
		
		for (int i=0; i<=part.length-1; i++) {
			
			String FirstCharacter = part[i].substring(0, 1);
			
			String RestCharacters	= part[i].substring(1);
			
			newStringSen = newStringSen +  FirstCharacter.toUpperCase() + RestCharacters;
			
			System.out.print(newStringSen + " ");
			
			newStringSen = "";
			
		}
		
		
		
		
		
	}
}
