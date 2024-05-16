package fiveFEBURARY;

import java.util.Arrays;
import java.util.TreeSet;

public class SortedInAssendingOrder {

	public static void main(String[] args) {
		
		int a[] = {5,2,7,8,1,3,2,7};
		
		Arrays.sort(a);
		
		for(int i=0; i<=a.length-1; i++) {
			
			System.out.print(a[i] +" ");
		}
		
		
		
		TreeSet ts = new TreeSet();
	
		
		for(int i=0; i<=a.length-1; i++) {
						
			ts.add(a[i]);
		}
					
		System.out.println("\n"+ts);
	}
}
