package june4;

public class FirstNonRepeatedCharacterInStringAnotherWay {

	public static void main(String[] args) {
		
		String s = "aabbbcdddd";
		
		/*for (int i= 0 ; i<=s.length()-1; i++) {
			
			if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
				
				System.out.println(s.charAt(i));
			}
		}*/
		
		
		char f[]	= s.toCharArray();
		
		for (  char  g : f) {
			
			if (s.indexOf(g)==s.lastIndexOf(g)) {
				System.out.println(g);
			}
			
		}

	}

}
