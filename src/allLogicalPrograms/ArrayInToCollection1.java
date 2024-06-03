package allLogicalPrograms;

import java.util.LinkedHashSet;



public class ArrayInToCollection1 {

	public static void main(String[] args) {
		
		int p[] = {4,2,1,3,5,9,0,4,10};
		
		LinkedHashSet lhs = new LinkedHashSet();
	
		for(int i=0 ; i<=p.length-1; i++) {
			
			lhs.add(p[i]);
			
		}


		System.out.println(lhs);
	}

}
