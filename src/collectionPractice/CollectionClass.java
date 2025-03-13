package collectionPractice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionClass {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("mohan");
		v.add(100);
		v.add('A');
		v.add(65.5f);
		v.add(100);
		v.add(null);
		v.add(null);
		
		System.out.println(v);	
		
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains("mohan"));
		System.out.println(v.contains("Mohan"));

		System.out.println(v);	
	
		v.add(4, 200);
		System.out.println(v);	
	
		v.remove(4);
		System.out.println(v);
		
		v.set(3, 70);
		System.out.println(v);
		
		System.out.println(v.get(2));
		
		//Iterator
		System.out.println();
		System.out.println("Print all Information using Iterator:-");
		
		Iterator itr = v.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		//List Iterator
		System.out.println();
		System.out.println("Print all Information using List Iterator:-");
		
		ListIterator litr	=v.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		
		//Enumaration
		System.out.println();
		System.out.println("Print all Information using Enumeration:-");
		
		Enumeration enu = v.elements();
		
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		
		//For Loop
		System.out.println();
		System.out.println("Print all Information using For Loop:-");
				
		
		for (int i=0; i<=v.size()-1; i++) {
			System.out.println(v.get(i));
		}
		
		//For EachLoop
		System.out.println();
		System.out.println("Print all Information using For Each Loop:-");
						
				
		for (Object s1 : v) {
			System.out.println(s1);
		}
		
		
		
	}

}
