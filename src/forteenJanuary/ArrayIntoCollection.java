package forteenJanuary;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class ArrayIntoCollection {

	public static void main(String []args) {
		
		int p[] = {4,2,1,3,5,9,0,4,10};
		
		LinkedHashSet hs = new LinkedHashSet();
		
		for(int i=0; i<=p.length-1; i++) {
			
			hs.add(p[i]);
		}
		
		System.out.println(hs);
		
	}
}
