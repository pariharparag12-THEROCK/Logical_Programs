package julyThirteen;

import java.util.HashMap;

public class CountOfChaaracterInStringArray {

	public static void main(String[] args) {
		
		String s = "abbcccdddd";
		
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
		
		
		
		

	}

}
