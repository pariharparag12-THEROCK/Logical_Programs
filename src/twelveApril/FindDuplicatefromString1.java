package twelveApril;

import java.util.LinkedHashSet;

public class FindDuplicatefromString1 {

	public static void main(String[] args) {
		
		String p = "#768732486ueyri@#&&55";
		
		System.out.println(p);
		
		char s[]	=	p.toCharArray();
		
		
		for (int i=0; i<=s.length-1; i++) {
			
			for (int j=i+1; j<=s.length-1; j++) {
				
				if (s[i]==s[j] && i!=j) {
					
					System.out.print(s[j] +" ");
				}
			}
		}
		
		System.out.println();
		
//		LinkedHashSet lhs = new LinkedHashSet();
//		
//		for (int i=0; i<=s.length-1; i++) {
//			
//			lhs.add(s[i]);
//		}
//		
//		System.out.println(lhs);

	}

}
