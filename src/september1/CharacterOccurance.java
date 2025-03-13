package september1;

public class CharacterOccurance {

	public static void main(String[] args) {
		
		String sentence = "engineering";
		
		int n=0;
		
		for (int i=0; i<=sentence.length()-1; i++) {
			
			if (sentence.charAt(i)=='e') {
				
				n=n+1;
			}
		}
		
		System.out.println("Numer of |e| present in sentence is : "+ n);

	}

}
