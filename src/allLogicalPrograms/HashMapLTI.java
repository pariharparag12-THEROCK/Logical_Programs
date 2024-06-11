package allLogicalPrograms;


import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapLTI {

	public static void main(String[] args) {
		
		String str[] = {"Apple", "Mango", "Pinepple", "pomergranates", "Avocado"};
		
		int ch[] = {1, 2, 3, 4, 5};
		
		
		LinkedHashMap<String, Integer> hashmap = new LinkedHashMap<>(); // LinkedHashMap is used when we require thye order of insertion = maintain
		
		
		for (int i=0; i<=ch.length-1; i++) {
			
			
			hashmap.put(str[i], ch[i]);
				
		}
		
		
		System.out.println(hashmap);
		
		Set<Entry<String, Integer>>	myset	=	hashmap.entrySet();
				
		for (Entry<String, Integer> m :myset)	{
			
			System.out.println(m.getKey() + " : "+ m.getValue());
		}
			
			
	}
		
		
	


	

}
