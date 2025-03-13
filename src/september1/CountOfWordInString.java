package september1;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountOfWordInString {

	public static void main(String[] args) {
		
		String str = "Alice is girl and Bob is boy";
		
		
		String ch[] = str.split(" ");
		
		LinkedHashMap<String, Integer> hashmap = new LinkedHashMap<>();
		
		for (String f : ch) {
			
			if (hashmap.containsKey(f)) {
				
				hashmap.put(f, hashmap.get(f)+1);
				
			}
			
			else {
				
				hashmap.put(f, 1);
			}
			
		}
		
		
		System.out.println(hashmap);
		
		
		

	}

}
