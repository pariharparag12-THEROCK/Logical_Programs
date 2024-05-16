package vishal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayListIC {

	public static void main(String[] args) {
		
      
		// converting array in collection
		
		int p[]= {5,2,7,8,1,3,9,6};
				
		HashSet al = new HashSet(); // order of insertion ---> Random
				
				for (int i=0; i<=p.length-1; i++) {
					
					al.add(p[i]);
				}
				
				System.out.println(al);
	}
}
