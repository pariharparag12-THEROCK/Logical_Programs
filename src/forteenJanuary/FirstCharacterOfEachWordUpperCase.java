package forteenJanuary;

public class FirstCharacterOfEachWordUpperCase {

	
public static void main(String args[]) {
			
        
		String sentence = "java and manual";
		
		String parts[] = sentence.split(" ");
		
		String newString = "";
		
		for (int i=0; i<=parts.length-1; i++) {
			
			String firstCharacter = parts[i].substring(0,1);
			
			String restChacters	= parts[i].substring(1);
			
			newString = newString + firstCharacter.toUpperCase() + restChacters;
			
			System.out.print(newString +" ");
			
			newString = "";
			
			
		}
		
		//System.out.print(newString);
	
		
		
	}
}
