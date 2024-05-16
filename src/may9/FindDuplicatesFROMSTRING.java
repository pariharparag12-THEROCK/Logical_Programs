package may9;

public class FindDuplicatesFROMSTRING {

	public static void main(String[] args) {
		
		String p = "#768732486ueyri@#&&55";
		
		char s[]=	p.toCharArray();
		
		
		for (int i=0; i<=s.length-1; i++) {
			
			for (int j=i+1; j<=s.length-1; j++) {
				
				if (s[i]==s[j] && i!=j) {
					
					System.out.print(s[j]+ " ");
				}
			}
		}

	}

}
