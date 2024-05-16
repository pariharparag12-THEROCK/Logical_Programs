package collection;

import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetIC {
	
	public static void main(String[]args) {
		
		//Note :It store only homogenous data
		TreeSet ts = new TreeSet();
		
		ts.add(300);
		ts.add(100);
		ts.add(200);
		ts.add(500);
		ts.add(400);
		ts.add(100);
		ts.add(700);
		ts.add(800);
		//ts.add(null);
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains(100));
		ts.remove(400);
		System.out.println(ts);
		
		ts.pollFirst();//remove first element
		System.out.println(ts);
		
		ts.pollLast();//remove last element
		System.out.println(ts);
		
		System.out.println(ts.first()); //It Shows First Element
		System.out.println(ts.last()); //It Shows last Element
		
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Object s :ts) {
			System.out.println(s);
		}
	}
}
