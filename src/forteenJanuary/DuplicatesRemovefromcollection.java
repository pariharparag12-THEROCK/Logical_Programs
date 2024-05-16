package forteenJanuary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicatesRemovefromcollection {

	public static void main(String []args) {
		
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
		
		HashSet llh = new HashSet(al);
		
		System.out.println(llh);
	}
}
