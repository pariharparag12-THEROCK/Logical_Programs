package september1;

public class FirstCharacterOfEachWordAsUpperCase {

	public static void main(String[] args) {
		
		String sentence = "java and manual";
		
		String parts[] = sentence.split(" ");
		
		String newString1="";
		
		for(int i=0; i<=parts.length-1; i++) {
			
			String firstcharacter =  parts[i].substring(0, 1);
			
			String remainingcharacter = parts[i].substring(1);
			
			newString1 =  firstcharacter.toUpperCase() + remainingcharacter;
			
			System.out.print(newString1+" ");
			
			newString1 ="";
		}
		
	

	}

}
