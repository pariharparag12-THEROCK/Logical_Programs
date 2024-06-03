package new_Programs;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		
		
		String s = "aabbbcdddd";
		
		/*for (int i=0; i<=s.length()-1; i++) {
			
			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
				
				System.out.println("first Non repeated character in String is : "+ s.charAt(i));
			}
			
		}*/
		
		char   ch[] = s.toCharArray();
		
		for(  char   f  :  ch) {
			
				if ( s.indexOf(f)==s.lastIndexOf(f)){
					
					System.out.println("First Non repeated character in String is : " + f);
					
					break;
				}
			
		}

	}

}
