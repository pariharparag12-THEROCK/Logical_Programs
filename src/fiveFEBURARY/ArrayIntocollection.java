package fiveFEBURARY;

import java.util.LinkedHashSet;

import org.apache.commons.math3.analysis.function.Add;

public class ArrayIntocollection {

	
	public static void main(String[]args) {
		
		
		
		int s[] = {4,5,7,23,32,9, 5,5};
		
		
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		for (int i=0; i<=s.length-1; i++) {
		

		
			lhs.add(s[i]);
		}
		
		System.out.println(lhs);
	}
}
