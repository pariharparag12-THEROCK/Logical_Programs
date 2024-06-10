package june4;

import java.util.HashMap;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		
		String str = "Alice is girl and Bob is boy";
		 
		String words[] = str.split(" ");
		
		
		
		HashMap<String, Integer> hashmap=new HashMap<>();
		
		
		for ( String f : words) {
			
			
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
