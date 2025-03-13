package november8;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String>  hashmap = new HashMap<>();
		
		hashmap.put(1, "Rajni");
		hashmap.put(2, "Deepika");
		hashmap.put(3, "Ranbir");
		hashmap.put(4, "Mahesh");
		
		
		System.out.println(hashmap);
		
		Set<Entry<Integer,String>> myset =	hashmap.entrySet();
		
		for (Entry<Integer,String> m : myset) {
			
			System.out.println(m);
		}
		
		System.out.println();
		
		System.out.println(hashmap.containsValue("Rajni"));
		System.out.println(hashmap.containsKey(2));
		System.out.println(hashmap.containsValue("Dipika"));

	}

}
