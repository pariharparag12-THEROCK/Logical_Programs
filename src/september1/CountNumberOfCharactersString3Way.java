package september1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountNumberOfCharactersString3Way {

	public static void main(String[] args) {
		
		String s = "abbcccdddd";
		
		String ch[] = s.split("");
		
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
			
			System.out.println(m.getKey()+" : "+m.getValue());
			
		}
		
		
		
	
	}
	
}	
