package hfjgh;

import java.util.HashMap;

public class countNumberOfRepeaatativeUsingHashMap {

	public static void main(String[] args) {

		String sentence  = "Alice is a girl and Bob is a Boy";
		
		
		String parts[]	=	sentence.split(" ");
		
		HashMap<String, Integer> hashmap = new HashMap<>();
		
		
		for (int i=0 ; i<=parts.length-1; i++) {
			
			
			if(hashmap.containsKey(parts[i])) {
				
				hashmap.put(parts[i], hashmap.get(parts[i])+1);		
				
			}
			
			else {
				
				hashmap.put(parts[i], 1);
				
			}
		}
		
		
		System.out.println(hashmap);
	}

}
