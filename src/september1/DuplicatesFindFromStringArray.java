package september1;

public class DuplicatesFindFromStringArray {

	public static void main(String[] args) {
		
		String s[] = { "Ankit", "Amol", "Shubham", "Priyanka", "Ankit", "Shubham", "Amol"};
		
		
		for (int i=0; i<=s.length-1; i++) {
			
			for (int j=i+1; j<=s.length-1; j++) {
				
				
				if (s[i].equalsIgnoreCase(s[j]) && i!=j) {
					
					System.out.println(s[j]+" ");
					
					
				}
				
			}
		}


	}

}
