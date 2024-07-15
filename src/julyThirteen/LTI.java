package julyThirteen;

import java.util.LinkedHashMap;

public class LTI {

	public static void main(String[] args) {
		
		String str[] = {"Apple", "Mango", "Pinepple", "pomergranates", "Avocado"};
		
		int ch[] = {1, 2, 3, 4, 5};
		
		LinkedHashMap<String, Integer> linkedhashmap = new LinkedHashMap<>();
		
		for (int i=0; i<=ch.length-1; i++) {
			
			linkedhashmap.put(str[i], ch[i]);
			
		}
		
		System.out.println(linkedhashmap);

	}

}
