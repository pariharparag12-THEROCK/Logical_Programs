package allLogicalPrograms;

public class RevString3 {

	public static void main(String[] args) {
		
		String sentence = "Life is a beautiful enjoys it";
		
		String parts[]	= sentence.split(" ");
		
		//String reverse = "";
		
		for (int i=parts.length-1; i>=0; i--) {
			
			//reverse = reverse + parts[i];
			
			//System.out.print(reverse +" ");
					
			//reverse = "";
			
			System.out.print(parts[i]+" ");
		}
		
		
		
		
	}

}
