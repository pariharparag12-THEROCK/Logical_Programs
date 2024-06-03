package allLogicalPrograms;

public class RevererseString6 {
			
	
	
	public static void main(String[]args) {
		
		String sentence = "My name is Ranjit";
		
		String  parts[]  = sentence.split(" ");
		
		String reverse="";
		
		for (int i=0; i<=parts.length-1; i++) {
			
			
			String r = parts[i];
			
			for(int j=r.length()-1; j>=0; j--) {
				
				reverse = reverse + r.charAt(j);
			}
			
			
			System.out.print(reverse+" ");
			
			reverse="";
		}
		
		
	}
}
