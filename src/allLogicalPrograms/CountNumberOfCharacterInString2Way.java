package allLogicalPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountNumberOfCharacterInString2Way {
	
	public static void main (String []args) {
		 
		String s = "abbcccdddd";
		
		HashMap<Character,Integer> hashmap = new HashMap<>();
		
		
		//String	ch[] =	s.split("");
		
		char ch[]=	s.toCharArray();
		
		
		for(  char  f  : ch) {
			
			if (hashmap.containsKey(f)) {
				
				hashmap.put(f, hashmap.get(f)+1);
			}
			
			
			else {
				 hashmap.put(f, 1);
			}
			
		}
		
		System.out.println(hashmap);
		
		
		Set<Entry<Character, Integer>>	myset	=	hashmap.entrySet();
		
		for ( Entry<Character, Integer>     m  :   myset) {
			
			System.out.println(m.getKey()+ " : "+ m.getValue());
			
		}
		
		
	}
}
