package november8;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfWordInString {

	public static void main(String[] args) {
		
		String str = "Alice is girl and Bob is boy";
		
		String ch[] = str.split(" ");
		
		HashMap<String, Integer> hashmap = new HashMap<>();
		
		for (String f : ch) {
			
			if (hashmap.containsKey(f)) {
				
				hashmap.put(f, hashmap.get(f)+1);
			}
		
		
			else {
				
				hashmap.put(f, 1);
			}
		}
		
		
		System.out.println(hashmap);
		
		Set<Entry<String, Integer>>	myset =	hashmap.entrySet();
		
		for (Entry<String, Integer> m : myset) {
			
			System.out.println(m.getKey()+" : "+ m.getValue());
		}
		
	}

}
