package allLogicalPrograms;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> mp = new HashMap<>();
		
		
		
		//put - It is used to add key and values. 
		
		
		// First Time print krne pr null deta he
		System.out.println(mp.put(1, "Ram")); 
		System.out.println(mp.put(2, "Rahim"));
		System.out.println(mp.put(1, "Ram"));
		System.out.println(mp.put(3, "ABC"));
		System.out.println(mp.put(1, "laxman"));  //Ram (previous print krega humne put kiya he toh
		System.out.println(mp.put(3, "XYZ")); //ABC
		
		System.out.print(mp); // Overide krk latest show krega beacuse key always unique,  value can be duplicate so it will remove
		
	}

}
