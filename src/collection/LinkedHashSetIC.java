package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetIC {

public static void main(String[]args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("rahul");
		lhs.add(100);
		lhs.add('A');
		lhs.add(56.5f);
		lhs.add(100);
		lhs.add(null);
		lhs.add(null);
		lhs.add("Katrina");
		lhs.add("Katrina");
		lhs.add("rahul");
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains("Katrina"));
		lhs.remove('A');
		System.out.println(lhs);
		
		
		System.out.println("Print all Information from HaslhsetIC using 'Iterator' cursor");
		
		   Iterator	itr = lhs.iterator();
		   
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		   
		   System.out.println("Print all Information from HaslhsetIC using ForEach loop");
		   
		   for(Object s1:lhs) {
			   System.out.println(s1);
		   }
	
	}
}
