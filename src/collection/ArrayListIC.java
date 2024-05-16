package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListIC {

	public static void main(String[]args) {
		
		ArrayList al = new ArrayList();
		
		al.add("mohan");
		al.add(100);
		al.add('A');
		al.add(65.5f);
		al.add(100);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());//index starting from 1
		System.out.println(al.isEmpty());
		System.out.println(al.contains("mohan"));
		System.out.println(al.contains("Mohan"));
		
		System.out.println(al);
		al.add(4,200);//Right Shift Operation
		System.out.println(al);
		al.remove(4); //Left Shift Operation
		System.out.println(al);
		al.set(3, 70); // Modify operation
		System.out.println(al);
		
		System.out.println(al.get(2) + "\n");
		
		System.out.println("Print all Information from ArrayList using 'Iterator' cursor");
		
	   Iterator	itr = al.iterator();
	   
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   
		System.out.println("\n"+"Print all Information from ArrayList using 'ListIterator' cursor");
		
		ListIterator litr= al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("\n"+"Print all Information from ArrayList using 'forloop' cursor");
				
				for(int i=0; i<=al.size()-1; i++) {
					System.out.println(al.get(i));
				}
		
		System.out.println("\n"+"Print all Information from ArrayList using 'ForEachLoop' cursor");
		
		for(Object s1 : al) {
			System.out.println(s1);
		}
		
	}
}
