package november8;

import java.util.LinkedHashSet;

public class ArrayInToCollection {

	public static void main(String[] args) {
	
		int p[] = {4,2,1,3,5,9,0,4,10};
		
		for (int i=0; i<=p.length-1; i++) {
			System.out.print(p[i]+" ");
		}
		
		System.out.println();
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		for (int i=0; i<=p.length-1; i++) {
			
			lhs.add(p[i]);
			
		}

		System.out.print(lhs);
	}

}
