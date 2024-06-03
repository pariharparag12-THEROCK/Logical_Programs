package allLogicalPrograms;

public class ReverseString5 {

	
	public static void main(String[]args) {
		
		
		String sentence = "India is my Country";
		
		String	parts[] =  sentence.split(" ");
		
		String reverse="";
		
		for(int i=0 ; i<=0; i++) {
			
			String r = parts[i];
			
			for(int j=r.length()-1; j>=0; j--) {
				
				reverse = reverse + r.charAt(j);
			}
			
			System.out.print(reverse +" ");
			
			reverse="";
		}
		
		
		for (int i=1; i<=parts.length-1; i++) {
			
			System.out.print(parts[i]+ " ");
		}
	}
}
