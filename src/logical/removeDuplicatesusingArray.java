package logical;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class removeDuplicatesusingArray {

	public static void main(String[]args) {
		
		ArrayList al = new ArrayList();
		
		al.add("mohan");
		al.add(null);
		al.add(null);
		al.add(100);
		al.add('A');
		al.add(100);
		al.add(null);
		al.add('A');
		
		
		System.out.println(al);
		
		LinkedHashSet lhs = new LinkedHashSet(al);
		
		
		System.out.println(lhs);
		
	}
}
