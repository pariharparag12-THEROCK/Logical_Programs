package julyThirteen;

import java.util.HashMap;

public class CountRepeatativeWordInString {

	public static void main(String[] args) {
		

		String str = "Alice is girl and Bob is boy";
		
		String words[] = str.split(" ");
		
		HashMap<String, Integer> hashmap = new HashMap<>();
		
		for (String word : words ) {
			
			if (hashmap.containsKey(word)) {
				
				hashmap.put(word, hashmap.get(word)+1);
			}
			
			else {
				
				hashmap.put(word, 1);
			}
		}
        	
		
		System.out.println(hashmap);
		
		//System.out.println(hashmap.keySet());
		
		for (String word: hashmap.keySet()) {
			
			if ((hashmap.get(word))>1) {
				
				System.out.println(word + " : " + hashmap.get(word));
			}
		}

	}

}
