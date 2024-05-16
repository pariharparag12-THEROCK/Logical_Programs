package logical;

public class DuplicateStringArray {

	
	public static void main(String[]args) {
		
		String  s[] = { "Amol", "Ankit", "Shubham", "priyanka", "Amol", "Ankit", "Shubham"};
		
		for (int i=0; i<=s.length-1; i++) {
			for(int j=i+1; j<=s.length-1; j++) {
				
				if (s[i].equals(s[j])  && i!=j) {
					
					System.out.println(s[j]);
				}
				
			}
		}
		
	}
}
