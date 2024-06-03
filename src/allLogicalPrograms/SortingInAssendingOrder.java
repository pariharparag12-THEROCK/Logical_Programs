package allLogicalPrograms;

import java.util.Arrays;
import java.util.TreeSet;

public class SortingInAssendingOrder {

	
	public static void main(String[]args) {
		
		int s[] = {3,5,2,4,6,9,3,6,3,0,6,1};
		
		Arrays.sort(s);
		
		for (int i=0; i<=s.length-1; i++) {
			
			System.out.print(s[i] + " ");
		}
		
		System.out.println();

		TreeSet ts = new TreeSet();
		
		for (int i=0; i<=s.length-1; i++) {
			
			
			ts.add(s[i]);
			
		}
		
		System.out.println(ts);
		
	}
}
