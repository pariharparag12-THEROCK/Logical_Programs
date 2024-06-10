package june4;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepatativecharcterInarray {

	public static void main(String[] args) {

		int a[] = {4,9,4,8,7,8,9};
		
		HashMap<Integer, Integer> hashmap = new HashMap<>();

		
		for ( int  f :a) {
			
			
			if (hashmap.containsKey(f)) {
				
				hashmap.put(f, hashmap.get(f)+1);
			}
			
			
			else {
				
				hashmap.put(f, 1);
			}
		}
		
		
		Set<Entry<Integer, Integer>> myset =	hashmap.entrySet();
		
		
		for (Entry<Integer, Integer> m :myset) {
			
			if (m.getValue()<=1) {
				System.out.println("The non repeatative number is "+ "\n"+ m.getKey()+ " : "+ m.getValue());
			}
			
		}
		
		
	}

}
