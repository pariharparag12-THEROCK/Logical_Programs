package julyThirteen;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class NonRepeatedNumberInArray {

	public static void main(String[] args) {
		
		
		int[] a = {4,9,4,8,7,8,9};
		
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		
		
		for (int number : a) {
			
			if (hashmap.containsKey(number)) {
				
				hashmap.put(number, hashmap.get(number)+1);
			}
			
			else {
				hashmap.put(number, 1);
			}
		}
		
		System.out.println(hashmap);
		
		Set<Entry<Integer, Integer>> myset = hashmap.entrySet();
		
		for (Entry<Integer, Integer> m : myset) {
			
			if (m.getValue()<=1) {
				
				System.out.println(m.getKey()+" : "+m.getValue());
			}
		}

	}

}
