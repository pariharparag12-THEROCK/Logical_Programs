package november8;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap = new HashMap<>();
		
		System.out.println(hashmap.put(1, "Ram"));
		System.out.println(hashmap.put(2, "rahim"));
		System.out.println(hashmap.put(1, "Ram"));
		System.out.println(hashmap.put(3, "ABC"));
		System.out.println(hashmap.put(1, "Laxman"));
		System.out.println(hashmap.put(3, "XYZ"));
		
		System.out.println(hashmap);

	}

}
