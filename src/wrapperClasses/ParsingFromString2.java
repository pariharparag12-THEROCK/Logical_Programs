package wrapperClasses;

public class ParsingFromString2 {

	public static void main(String[] args) {
		
		String price1 = "462.5";
		String price2 ="237.5";
		
		//System.out.println(price1+price2);
		
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		
		System.out.println(p1);
		System.out.println(p2);
			
		double sum = p1+p2;
		
		if (sum==700.00) {
			System.out.println("Passed : " + sum);
		}
		
		else {
			System.out.println("Failed : " +sum);
		}
	}

}
