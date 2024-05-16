package collection;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIC {

	
public static void main(String[]args) {
		
		Vector v = new Vector();
		
		v.add("mohan");
		v.add(100);
		v.add('A');
		v.add(65.5f);
		v.add(100);
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());//index starting from 1
		System.out.println(v.isEmpty());
		System.out.println(v.contains("mohan"));
		System.out.println(v.contains("Mohan"));
		
		System.out.println(v);
		v.add(4,200);//Right Shift Operation
		System.out.println(v);
		v.remove(4); //Left Shift Operation
		System.out.println(v);
		v.set(3, 70); // Modify operation
		System.out.println(v);
		
		System.out.println(v.get(2) + "\n");
		
		System.out.println("Print vl Information from Vector using 'Iterator' cursor");
		
	   Iterator	itr = v.iterator();
	   
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   
		System.out.println("\n"+"Print vl Information from Vector using 'ListIterator' cursor");
		
		ListIterator litr= v.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
	System.out.println("\n"+"Print vl Information from Vector using 'Enumeration' cursor");
		
		Enumeration enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		
		
		
		System.out.println("\n"+"Print vl Information from Vector using 'forloop' cursor");
				
				for(int i=0; i<=v.size()-1; i++) {
					System.out.println(v.get(i));
				}
		
		System.out.println("\n"+"Print vl Information from Vector using 'ForEachLoop' cursor");
		
		for(Object s1 : v) {
			System.out.println(s1);
		}
		
	}
	
}
