package julyThirteen;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountAndNumberOfCharacterInString {

	public static void main(String[] args) {
	
		String s = "abbcccdddd";
		
		char f[] =	s.toCharArray();
		
		HashMap<Character, Integer> hashmap = new HashMap<>();
		
		for (int i=0; i<=f.length-1; i++) {
			
			
			if (hashmap.containsKey(f[i])) {
				
				hashmap.put(f[i], hashmap.get(f[i])+1);
			}
			
			else {
				hashmap.put(f[i], 1);
			}
			
			
		}
		
		
		System.out.println(hashmap);
		
		
		Set<Entry<Character, Integer>>	myset	= 	hashmap.entrySet();
		
		for (Entry<Character, Integer> m : myset) {
			
			System.out.println(m.getKey()+ " : "+ m.getValue());
		}
		
		
		
		

	}

}
