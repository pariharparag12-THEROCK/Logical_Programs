package twelveApril;

public class CountWhiteSpacesString {

	public static void main(String[] args) {
		
		
				String sentence	 = "Pu  ne ";
				
				//int count = 0;
				
				String s = "";
				
				for (int i=0; i<=sentence.length()-1; i++) {
					
							//char ch = sentence.charAt(i);
							
//							if (ch == ' ') {
//								count = count+1;
//							}
					
					
					if(sentence.charAt(i) == ' ') {
						
						s = s+1;//
						
						sentence.charAt(i);
					}
					
					
					
					
				}
				
				
			//	System.out.println("Number of count of WhiteSpacesString is : " +count );
				
				System.out.println("Number of count of WhiteSpacesString is : " +s.length() );	
	}

}
