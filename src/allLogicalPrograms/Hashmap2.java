package allLogicalPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;



public class Hashmap2 {

	public static void main(String[] args) {
		
		
		
		HashMap<Integer, String>  mp = new HashMap<>();
		//Output of hashmap always show in the curly braces
		
		
		//put method - It is used to add key and values. 
		
		mp.put(1, "Mahesh");
		mp.put(2, "Dipika");
		mp.put(3, "Ranbir");
		mp.put(4, "Mahesh");
		mp.put(1, "Rajni");  //overide hoga new vala
		
		
		System.out.println(mp);
		
		//get method - It is used to get the particular value from hashmap 
		System.out.println(mp.get(1));
		
		
		
		//entrySet Method - It is used to return a collection view of the mappings contained in this map.
		
		Set<Entry<Integer, String>> myset = mp.entrySet();
		
		for(Entry<Integer, String>  m  : myset) {
			
			//System.out.println(m);
			//System.out.println(m.getValue()); //It is used to get particular value of that key.
			System.out.println(m.getKey());	//It is used to get particular kay of that value.
		}
		
		
		
		System.out.println();
		
		System.out.println(mp.containsKey(1)); //true
		System.out.println(mp.containsValue("Rajni")); // true
		System.out.println(mp.containsValue("ranbir")); // false
	}

}
