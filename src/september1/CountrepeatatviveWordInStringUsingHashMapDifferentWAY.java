package september1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountrepeatatviveWordInStringUsingHashMapDifferentWAY {

	public static void main(String[] args) {
		

String sentence = "Alice is boy and Bob is girl";
		
		String	parts[]	=  sentence.split(" ");
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		
		for( String word : parts) {
			
			if(hashMap.containsKey(word)) {
				
				hashMap.put(word, hashMap.get(word)+1);		
			}
			
			
			else {
				
				hashMap.put(word, 1);
			}
			
		}
		
		
		System.out.println(hashMap);
		
		
		Set<Entry<String, Integer>> myset =hashMap.entrySet();
		
		for (Entry<String, Integer> m : myset) {
			
			if (m.getValue()>1) {
				
				System.out.println(m.getKey()+" : "+ m.getValue());
				
			}
		}
		
		
		//AnotherWAY using KEYSET
		
		for (String f : hashMap.keySet()) {
			
			if (hashMap.get(f)>1) {
				
				System.out.println(f + " : "+ hashMap.get(f));
				
			}
		}
		
		
		
		
		
	}

}
