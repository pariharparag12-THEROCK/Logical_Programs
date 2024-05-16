package twelveApril;

public class RevString1 {

		
		public static void main(String[]args) {
			
			
			
			String sentence = "India is my Country";
			
			String parts[] = sentence.split(" ");
			
			System.out.print(parts[0] + " ");
			
			String reverse = "";
			
			for (int i=1; i<=parts.length-2; i++) {
				
					String r =	parts[i];
					
					for (int j=r.length()-1; j>=0; j--) {
						
						reverse = reverse + r.charAt(j);
						
					}
					
					
					System.out.print(reverse + " ");
					
					reverse = "";
			}
			
			
			System.out.print(parts[parts.length-1]);
			
		}
}
