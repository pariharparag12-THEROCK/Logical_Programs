package june4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DuplicatesRemoveFromCollection4 {

	
	public static void main(String[]args) {
		
		ArrayList al = new ArrayList();
		
		//al.add("mohan");
		//al.add(100);
		al.add(100);
		al.add(100);
		//al.add('D');
		//al.add(null);
		al.add(990);
		//al.add(null);
		//al.add(null);
		//al.add("mohan");
		al.add(877);
		//al.add(null);
		
		
		System.out.println(al);
		
		
		LinkedHashSet lhs = new LinkedHashSet(al);
		
		
		//System.out.println(lhs);
		
		HashSet hs = new HashSet(al);
		
		//System.out.println(hs);
		
		
		TreeSet ts  =new TreeSet(al);
		
		
		System.out.println(ts);
		
	}
}
