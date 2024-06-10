package june4;

public class ReverseString4 {

	public static void main(String[] args) {
		
		String sentence = "India is my country";
		
		String parts[] = sentence.split(" ");
		
		
		
		
		for (int i=0; i<=parts.length-2; i++) {
			System.out.print(parts[i]+" ");
		}
		
		
		String reverse="";
		
		for (int i=parts.length-1; i<=parts.length-1; i++) {
			
			String r = parts[i];
			
			for (int j=r.length()-1; j>=0; j--) {
				
				reverse = reverse + r.charAt(j);
			}
			
			
			System.out.print(reverse +" ");
			
			reverse = "";
		}

	}

}
