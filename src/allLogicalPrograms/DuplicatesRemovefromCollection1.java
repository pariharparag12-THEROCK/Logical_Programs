package allLogicalPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DuplicatesRemovefromCollection1 {

	
	public static void main(String[]args) {
		
		ArrayList al = new ArrayList();
		
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
		
		System.out.println(al);
	
	
	
	
	LinkedHashSet lhs = new LinkedHashSet(al);
	
	System.out.println(lhs);
	
	
}
}