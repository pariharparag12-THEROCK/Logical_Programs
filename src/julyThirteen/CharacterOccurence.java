package julyThirteen;

public class CharacterOccurence {

	public static void main(String[] args) {
		
		String sentence ="engineering";
		
		int count=0;
		
		for (int i=0; i<=sentence.length()-1; i++) {
			
			if (sentence.charAt(i)=='e') {
				
				count = count+1;
			}
			
		}
		
		System.out.println("Number of e present in sentence : "+count );

	}

}
