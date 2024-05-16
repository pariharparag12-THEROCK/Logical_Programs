package twelveApril;



public class firstCharacterOFEachWordAsUpperCase {

	
	public static void main(String[]args) {
		
		String sentence = "java and manual";
		
		System.out.println(sentence);
		
		String	parts[]	 =	sentence.split(" ");
		
		
		String newString = "";
		
		for (int i=0; i<=parts.length-1; i++) {
			
			String firstCharacter =  parts[i].substring(0, 1);
			
			String remainingCharcters	= parts[i].substring(1);
			
			newString =   firstCharacter.toUpperCase() + remainingCharcters;
			
			System.out.print(newString + " ");
			
			newString ="";
			
		}
		
		
		
		}
		
	
}
