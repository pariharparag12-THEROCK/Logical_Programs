package forteenJanuary;

import java.util.HashSet;

public class DuplicateFindFromSTRING {

	
	public static void main(String args[]) {
		
		String p = "#768732486ueyri@#&&55";
		
		char S[] = p.toCharArray();
		
		for (int i=0; i<=S.length-1; i++) {
			
			for (int j=i+1; j<=S.length-1; j++) {
				
				if (S[i]==S[j] && i!=j) {
					
					System.out.print(S[j] + " ");
					
				}
			 }
			
		}
		
		System.out.println();
		
		
		/*HashSet lhs = new HashSet();
		
		for (int i=0 ; i<=S.length-1; i++) {
			
			lhs.add(S[i]);
			
		}
		
		
		System.out.println(lhs);
	}
		*/
		
	}
}
