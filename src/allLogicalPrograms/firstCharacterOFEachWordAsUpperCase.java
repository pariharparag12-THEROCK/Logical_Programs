package allLogicalPrograms;



public class firstCharacterOFEachWordAsUpperCase {

	
	public static void main(String[]args) {
		
		String sentence = "java and manual";
		
		System.out.println(sentence);
		
		String	parts[]	 =	sentence.split(" ");
		
		
		String str = "";
		
		for (int i=0; i<=parts.length-1; i++) {
			
			String firstCharacter = str+ parts[i].substring(0,1);
			
			String remainingCharcters	= str+ parts[i].substring(1);
			
			String newString =   firstCharacter.toUpperCase() + remainingCharcters;
			
			System.out.print(newString + " ");
			
			newString ="";
			
		}
		
		
		
		}
		
	
}
