package november8;

public class ReverseString6 {

	public static void main(String[] args) {
		
		String sentence = "My name is Ranjit";
		
		String Parts[] = sentence.split(" ");
		
		String reverse ="";
		
		for (int i=0; i<=Parts.length-1; i++) {
			
			String r = Parts[i];
			
			for (int j=r.length()-1; j>=0; j--) {
				
				reverse = reverse + r.charAt(j);
			}
			
			System.out.print(reverse+" ");
			
			reverse="";
			
		}

	}

}
