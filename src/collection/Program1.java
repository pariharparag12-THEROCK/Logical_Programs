package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Program1 {

	
	public static void main(String[]args) {
		
		ArrayList al = new ArrayList();
		
		al.add("mohan");
		al.add(100);
		al.add('A');
		al.add(65.5f);
		al.add(100);
		al.add(null);
		al.add(null);
		al.add(65.5f);
		al.add(65.5f);
		al.add(65.5f);
		
		System.out.println(al);
		
		HashSet hs = new HashSet(al);
		
		System.out.println(hs);
				
	}
}
