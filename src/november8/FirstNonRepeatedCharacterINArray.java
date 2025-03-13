package november8;

public class FirstNonRepeatedCharacterINArray {

	public static void main(String[] args) {
	
		String s = "aabbbcdddd";
		
		/*
		 * for (int i=0; i<=s.length()-1; i++) {
		 * 
		 * if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
		 * 
		 * System.out.println("The Non repeated chracter is : "+ s.charAt(i)); }
		 * 
		 * }
		 */
		
		
		/*
		 * char S[] = s.toCharArray();
		 * 
		 * for (int i=0; i<=S.length-1; i++) {
		 * 
		 * if(s.indexOf(S[i])==s.lastIndexOf(S[i])) {
		 * System.out.println("The Non repeated chracter is : "+ S[i]); } }
		 */
		
		
		char ch[] = s.toCharArray();
		
		for(char f : ch) {
			
			if (s.indexOf(f)==s.lastIndexOf(f)) {
				System.out.println("The Non repeated chracter is : "+ f);
			}
		}

	}

}
