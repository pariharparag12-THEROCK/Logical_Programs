package sixteenmarch;

import java.util.LinkedHashSet;

import org.apache.commons.math3.analysis.function.Add;

public class DuplicatesFINDFROMSTRING {

	public static void main(String[] args) {
	
		String p = "#768732486ueyri@#&&55"; //# 7 6 8 & 5  
		
		System.out.println(p);
		
		char s[] =	p.toCharArray();
		
		for(int i=0; i<=s.length-1; i++) {
			
			for(int j=i+1; j<=s.length-1; j++) {
				
				if ((s[i]==s[j]) && (i!=j)) {
					
					System.out.print(s[j] +" ");
					
				}
			}
			
		}
		
		System.out.println();
		
		char g[] =	p.toCharArray();
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		for (int i=0; i<=g.length-1; i++) {
			lhs.add(g[i]);
		}
		
		System.out.println(lhs);
		
		
		
		

	}

}
