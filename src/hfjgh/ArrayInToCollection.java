package hfjgh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayInToCollection {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		al.add("mohan");
		al.add(10);
		al.add(100);
		al.add(100);
		al.add('D');
		al.add(null);
		al.add(990);
		al.add(null);
		al.add(null);
		al.add("mohan");
		
		System.out.println(al);
		
		
		HashSet hs = new HashSet(al);
		
		System.out.println(hs);
		
		
		LinkedHashSet lhs = new LinkedHashSet(al);
		
		System.out.println(lhs);
		
		
		//TreeSet  ts = new TreeSet(al);   // It stores only homogeneous data
		
		//System.out.println(ts);
	}

}
