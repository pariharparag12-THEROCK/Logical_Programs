package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIC {

	public static void main(String[]args) {
		
		HashSet hs = new HashSet();
		
		hs.add("rahul");
		hs.add(100);
		hs.add('A');
		hs.add(56.5f);
		hs.add(100);
		hs.add(null);
		hs.add(null);
		hs.add("Katrina");
		hs.add("Katrina");
		hs.add("rahul");
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("Katrina"));
		hs.remove('A');
		System.out.println(hs);
		
		
		System.out.println("Print all Information from HashSetIC using 'Iterator' cursor");
		
		   Iterator	itr = hs.iterator();
		   
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		   
		   System.out.println("Print all Information from HashSetIC using ForEach loop");
		   
		   for(Object s1:hs) {
			   System.out.println(s1);
		   }
	
	}
}
