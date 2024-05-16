package fiveFEBURARY;

public class KeepFirstCharacterAndRemoveRemaining {

	public static void main (String []args) {
		
		String sentence = "java and manual";
		
		String parts[] =  sentence.split(" ");
		
		String newStringSen = "";
		
		for (int i=0 ; i<=parts.length-1; i++) {
			
			String	firstcharcter =	parts[i].substring(0,1);
			
			newStringSen = newStringSen + firstcharcter.toUpperCase();
			
			System.out.print(newStringSen +" ");
			
			newStringSen = "";
		}
		
		
	}
}
