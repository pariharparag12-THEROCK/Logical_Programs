package november8;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class firstNonRepeatedCharacterInStringAnotherWay {

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
		
		
		System.out.println(hashmap);
		
		Set<Entry<Character, Integer>>	myset = hashmap.entrySet();
		
		
		for (Entry<Character, Integer> m : myset) {
			 
			if (m.getValue()<=1) {
				
				System.out.println("The Non repeated character is " +"\n"+ m.getKey() +" : "+m.getValue());
			}
			
		}

	}

}
