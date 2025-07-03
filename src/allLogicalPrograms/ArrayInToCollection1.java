package allLogicalPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;



public class ArrayInToCollection1 {

	public static void main(String[] args) {
		
		int p[] = {4,2,1,3,5,9,0,4,10};
		
//		Integer intergerArray1[] = new Integer[p.length];
//		
//		for(int i=0; i<=p.length-1; i++) {	
//			
//			intergerArray1[i] = p[i];		
//		}
//		
//		
//		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Arrays.asList(intergerArray1));
//		
//		System.out.println(lhs);
//		
		
		
		//LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		LinkedHashSet lhs = new LinkedHashSet();
	
		for(int i=0 ; i<=p.length-1; i++) {
			
			lhs.add(p[i]);
			
		}


		System.out.println(lhs);
		
	
		 
	   /*    int p[] = {4,2,1,3,5,9,0,4,10};
	       
	       Integer integerarray1[]  = new Integer[p.length]; 
	       
	       for (int i=0; i<=integerarray1.length-1; i++){
	           
	           integerarray1[i] = p[i];
	       }
		
		
	       LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Arrays.asList(integerarray1));
	       System.out.println(lhs);
		*/
		
		
		
	}

}
