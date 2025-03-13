package september1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatedCharacterINAnotherWay {

	public static void main(String[] args) {
		
		String s = "aabbbcdddd";
		
		char ch[] = s.toCharArray();
		
		HashMap<Character, Integer> hashmap = new HashMap<>();
		
		for (char f : ch) {
			
			if (hashmap.containsKey(f)) {
				
				hashmap.put(f, hashmap.get(f)+1);				
			}
			
			else {
				
				hashmap.put(f, 1);
			}
			
		}
		
		
		Set<Entry<Character, Integer>> myset = 	hashmap.entrySet();
	
		for (Entry<Character, Integer> m : myset) {
			
			if (m.getValue()<=1) {
				
				System.out.println(m.getKey()+" : "+ m.getValue());
			}
			
			
		
		}
		
		
		
		
		
	

		}

}
