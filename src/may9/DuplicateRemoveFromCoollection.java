package may9;


import java.util.ArrayList;
import java.util.HashSet;




public class DuplicateRemoveFromCoollection {

	public static void main(String[]args) {
		
		ArrayList al  = new ArrayList();
		
		al.add("mohan");
		al.add(100);
		al.add(100);
		al.add(100);
		al.add('D');
		al.add(null);
		al.add(990);
		al.add(null);
		al.add(null);
		al.add("mohan");
		al.add("mohan");
		al.add(100);
		al.add(100);
		al.add(100);
		al.add('D');
		al.add(null);
		al.add(990);
		al.add(null);
		al.add(null);
		al.add("mohan");
		
		al.add('u');
		al.add(1000);
		al.add("parag");
		
		System.out.println(al);
		
		
		HashSet hs = new HashSet(al);
		
		System.out.println(hs);
		
		
		
	}
}
