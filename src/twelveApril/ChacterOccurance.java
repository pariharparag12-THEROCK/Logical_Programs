package twelveApril;

public class ChacterOccurance {

	public static void main(String[] args) {
		
		String sentence = "engineering";
		
		int s = 0;
		
		for (int i=0; i<=sentence.length()-1; i++) {
			
			if (sentence.charAt(i)=='e') {
				
				s=s+1;
			}
			
		}
		
		
		//System.out.println("Number of ||e|| present in sentence is "+ s.length());
		
		System.out.println("Number of ||e|| present in sentence is "+ s);
	}

}
