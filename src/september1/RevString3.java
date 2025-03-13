package september1;

public class RevString3 {

	public static void main(String[] args) {
		
		String sentence = "Life is a beautiful enjoys it";
		
		String parts[] = sentence.split(" ");

//		String reverse = "";
//		
//		for (int i=parts.length-1; i>=0; i--) {
//			
//			String r =parts[i];
//			
//			for (int j=0; j<=r.length()-1; j++) {
//				
//				reverse =reverse + r.charAt(j);
//			}
//			
//			System.out.print(reverse+" ");
//			
//			reverse ="";
		
		
		
		for (int i=parts.length-1; i>=0; i--) {
			System.out.print(parts[i]+" ");
		}
	}

}
