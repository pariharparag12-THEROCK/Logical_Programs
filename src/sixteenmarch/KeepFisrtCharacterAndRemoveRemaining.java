package sixteenmarch;



public class KeepFisrtCharacterAndRemoveRemaining {

	public static void main(String[] args) {
		
		String sentence = "java and manual";
		
		String parts[] = sentence.split(" ");

		String newString = "";
		
		for (int i=0; i<=parts.length-1; i++) {
			
			String firstcharcter = parts[i].substring(0, 1);
			
			newString = newString + firstcharcter.toUpperCase();
			
			System.out.print(newString + " ");
			
			newString = "";
		}
		
	}

}
