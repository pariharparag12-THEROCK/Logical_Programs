package sixteenmarch;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DuplicatesRemoveFromCollection {

	public static void main(String[]args) {
		
		ArrayList al = new ArrayList();
		
		al.add("mohan");
		al.add(null);
		al.add(10);
		al.add(20);
		al.add("mohan");
		al.add('r');
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(20);
		
		System.out.println(al);
		
		LinkedHashSet lhs = new LinkedHashSet(al);
		
		System.out.println(lhs);
	}
}
