package september1;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		
		String s = "aabbbcdddd";
		
//		for (int i=0; i<=s.length()-1; i++) {
//			
//			if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
//				
//				System.out.println(" The First Non Repeated Character is : "+s.charAt(i) );
//				
//				
//			}
//			
//		}
		
		char ch[] = s.toCharArray();
		
		for (char f : ch) {
			
			
			if (s.indexOf(f)==s.lastIndexOf(f)) {
				
				System.out.println(" The First Non Repeated Character is : "+ f);
				
				break;
			}
			
		}
		
		
		

	}

}
