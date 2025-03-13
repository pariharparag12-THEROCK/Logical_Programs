package september1;

public class KeepTheFirstCharacterOfWordAndRemovingOne {

	public static void main(String[] args) {
		
		String sentence = "java and manual";
		
		String parts[] = sentence.split(" ");
		
		
		String newString ="";
		
		
		for(int i=0; i<=parts.length-1; i++) {
			
			String	firstcharacter = parts[i].substring(0, 1);
			
			newString = newString + firstcharacter.toUpperCase();
			
			System.out.print(newString + " ");
			
			newString = "";
			
			
			
			
		}
		
		

	}

}
