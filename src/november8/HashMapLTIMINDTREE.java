package november8;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapLTIMINDTREE {

	public static void main(String[] args) {
		
		String str[] = {"Apple", "Mango", "Pinepple", "pomergranates", "Avocado"};
		
		int ch[] = {1,2,3,4,5};
		
		LinkedHashMap<String, Integer> linkedhashmap = new LinkedHashMap<>();
		
		for(int i=0; i<=ch.length-1; i++) {

			linkedhashmap.put(str[i], ch[i]);
		
		}

		System.out.println(linkedhashmap);
		
		Set<Entry<String, Integer>> myset = linkedhashmap.entrySet();
		
		for (Entry<String,Integer> m: myset) {
			
			System.out.println(m.getKey()+" : "+ m.getValue());
		}
		
		System.out.println();
		
		for (Entry<String,Integer> m: myset) {
			
			System.out.println(m);
		}
		
	}

}
