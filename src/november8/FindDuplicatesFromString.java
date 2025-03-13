package november8;

import java.util.LinkedHashSet;

public class FindDuplicatesFromString {

	public static void main(String[] args) {
		
		String p = "#768732486ueyri@#&&55";
		
		char s[] = p.toCharArray();
		
		for (int i=0; i<=s.length-1; i++) {
			
			System.out.print(s[i]);
		}
		
		System.out.println();
		
		for (int i=0; i<=p.length()-1; i++) {
			
			for (int j=i+1; j<=p.length()-1; j++) {
				
				if (s[i]==s[j]  && i!=j) {
					System.out.print(s[j]+" ");
				}
			}
		}
		
		System.out.println();
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		for (int i=0; i<=s.length-1; i++) {
			
			lhs.add(s[i]);
		}
		

		System.out.print(lhs);
	}

}
