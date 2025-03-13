package november8;

public class KeepFirstCharacterOfWordAndRemoving1 {

	public static void main(String[] args) {
		
		String sentence = "Java And Manual";
		
		System.out.println(sentence);
		System.out.println();
		
		String parts[] = sentence.split(" ");
		
		String newSentence = "";
		
		for (int i=0; i<=parts.length-1; i++) {
			
			String firstcharacter = parts[i].substring(0, 1);
			
			newSentence = firstcharacter.toUpperCase();
			
			System.out.print(newSentence + " ");
			
			newSentence ="";
		}

	}

}
