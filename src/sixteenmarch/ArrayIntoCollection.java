package sixteenmarch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayIntoCollection {

	public static void main(String[]arg) {
		
		//int s[] = {4,5,7,23,32,9, 5,5};
		
		int s[] = {4,5,7,23,32,9,5,5};
		
		
		TreeSet ts = new TreeSet();
		
		for (int i=0; i<=s.length-1; i++) {
			
			ts.add(s[i]);
			
		
		}
		
		System.out.println(ts);
	}
}
