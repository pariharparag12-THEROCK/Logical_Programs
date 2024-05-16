package sixteenmarch;

public class ReverseString2 {

	public static void main(String[] args) {
	 
		String sentence = "India is my Country";
		
		String parts[] = sentence.split(" ");
		
		System.out.print(parts[0] +" ");
		
		String revereseword = "";
		
		for(int i=1; i<=parts.length-2; i++) {
			
			String r = parts[i];
			
			for (int j=r.length()-1; j>=0; j--) {
				
				revereseword = revereseword + r.charAt(j);
				
			}
			
			System.out.print(revereseword +" ");
			
			revereseword ="";
		}
		
		System.out.print(parts[parts.length-1]);

	}

}
