package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIC {
	
	public static void main(String[]args) {
		
		LinkedList l = new LinkedList();
		
		l.add("mohan");
		l.add(100);
		l.add('A');
		l.add(65.5f);
		l.add(100);
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		System.out.println(l.size());//index starting from 1
		System.out.println(l.isEmpty());
		System.out.println(l.contains("mohan"));
		System.out.println(l.contains("Mohan"));
		
		System.out.println(l);
		l.add(4,200);//Right Shift Operation
		System.out.println(l);
		l.remove(4); //left Shift Operation
		System.out.println(l);
		l.set(3, 70); // Modify operation
		System.out.println(l);
		
		System.out.println(l.get(2) + "\n");
		
		System.out.println("Print ll Information from linkedlist using 'Iterator' cursor");
		
	   Iterator	itr = l.iterator();
	   
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   
		System.out.println("\n"+"Print ll Information from linkedlist using 'listIterator' cursor");
		
		ListIterator litr= l.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}

		
		
		System.out.println("\n"+"Print ll Information from linkedlist using 'forloop' cursor");
				
				for(int i=0; i<=l.size()-1; i++) {
					System.out.println(l.get(i));
				}
		
		System.out.println("\n"+"Print ll Information from linkedlist using 'ForEachloop' cursor");
		
		for(Object s1 : l) {
			System.out.println(s1);
		}
		
	}
}
