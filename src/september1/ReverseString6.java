package september1;

public class ReverseString6 {

	public static void main(String[] args) {
		
		String sentence = "My name is Ranjit";
		
		String parts[] = sentence.split(" ");
		
		for (int i=0; i<=parts.length-1; i++) {
			
			System.out.print(parts[i]+" ");
		}
		
		System.out.println();
		
		System.out.println();
		
		String str ="";
		
		for (int i=0; i<=parts.length-1; i++) {		
			
			String r = parts[i];
			
			for (int j=r.length()-1; j>=0; j--) {
				
				str = str + r.charAt(j);
				
			}
			
			System.out.print(str+" ");
			
			str="";
			
		}

	}

}
