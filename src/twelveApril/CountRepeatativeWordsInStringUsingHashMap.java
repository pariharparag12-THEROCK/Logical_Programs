package twelveApril;

import java.util.HashMap;



public class CountRepeatativeWordsInStringUsingHashMap {

	public static void main(String[] args) {


		String sentence = "Alice is boy and Bob is girl";
		
		String	parts[]	=  sentence.split(" ");
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		
		for( String word : parts) {
			
			if(hashMap.containsKey(word)) {
				
				hashMap.put(word, hashMap.get(word)+1);		
			}
			
			
			else {
				
				hashMap.put(word, 1);
			}
			
		}
		
		
		System.out.println(hashMap);

	}

}
