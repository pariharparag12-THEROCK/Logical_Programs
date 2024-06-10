package allLogicalPrograms;

import java.util.HashMap;

public class CountNumberOfCharacterInString1Way {

	public static void main(String[] args) {
		
		String s = "abbcccdddd";
		
		HashMap<Character,Integer> hashmap = new HashMap<>();
		
		
		for(int i=0; i<=s.length()-1; i++) {
			
			if (hashmap.containsKey(s.charAt(i))) {
				
				hashmap.put(s.charAt(i), hashmap.get(s.charAt(i))+1);
				
			}
			
			else {
				hashmap.put(s.charAt(i), 1);
			}
			
			
		}
		
		
		System.out.println(hashmap);
		

	}

}
