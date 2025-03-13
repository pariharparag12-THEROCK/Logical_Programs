package november8;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountRepeatativeWordInStringUsingHashMapInDifferentWay {

	public static void main(String[] args) {
		
		String sentence = "Alice is boy and Bob is girl";
		
		String ch[] = sentence.split(" ");

		HashMap<String, Integer> hashmap = new HashMap<>();
		
		for (String f : ch) {
			
			if (hashmap.containsKey(f)) {
				
				hashmap.put(f,  hashmap.get(f)+1);
			}
			
			else {
				
				hashmap.put(f, 1);
			}
			
		}
		
		System.out.println(hashmap);
		
		Set<Entry<String, Integer>> myset = hashmap.entrySet();
		
		for (Entry<String, Integer> m : myset) {
			
			if (m.getValue()>1) {
				System.out.println(m.getKey()+" : "+ m.getValue());
			}
		}
		
		System.out.println(hashmap.keySet());
		
		
		//Another Way using KeySet
		
		
		for (String f : hashmap.keySet()) {
			
			if (hashmap.get(f)>1) {
				
				System.out.println(f+" : "+ hashmap.get(f));
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
