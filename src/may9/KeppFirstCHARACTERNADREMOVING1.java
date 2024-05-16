package may9;



public class KeppFirstCHARACTERNADREMOVING1 {

	public static void main(String[] args) {
		
		String sentence = "Java and Manual";
		
		String	parts[]	= sentence.split(" ");
		
		
		
		String newString="";
		
		for (int i=0; i<=parts.length-1; i++) {
			
			String	firstcharcter	=	parts[i].substring(0, 1);
			newString = firstcharcter.toUpperCase();
			
			System.out.print(newString+ " ");
			
			newString = "";
			
		}
			
		
			
		}

	

}
