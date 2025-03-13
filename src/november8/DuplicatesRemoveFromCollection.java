package november8;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DuplicatesRemoveFromCollection {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(100);
		al.add("mohan");
		al.add("Ram");
		al.add(100);
		al.add('A');
		al.add("mohan");
		al.add(null);
		al.add(null);
		al.add("ram");
		
		System.out.println(al);
		
		
		LinkedHashSet lhs = new LinkedHashSet(al);
		
		System.out.println(lhs);

	}

}
