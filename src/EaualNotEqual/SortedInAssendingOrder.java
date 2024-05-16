package EaualNotEqual;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocParts;


public class SortedInAssendingOrder {

	public static void main(String []args) {
		
		int a[] = {5,2,7,8,1,3};
		
		//Arrays.sort(a);
		
		for (int i=0; i<=a.length-1; i++) {
			System.out.print(a[i] +" ");
		}
		
		System.out.println();
		
		TreeSet ts = new TreeSet();
		
		for(int i=0; i<=a.length-1; i++) {
			
			ts.add(a[i]);
		}
		
		System.out.print(ts);
		
	}
}
