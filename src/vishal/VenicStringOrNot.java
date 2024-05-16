package vishal;

import java.util.Arrays;

public class VenicStringOrNot {

	public static void main(String[]args){
		
		String a = "race";
		String b = "care";
		
		char c[] = a.toCharArray();
		char d[] =	b.toCharArray();
		
		
		Arrays.sort(c); //sorting ho jati ----> "a,c,e,r"--->he baad me ascending desecnding me bhi use kr skte he
		Arrays.sort(d);
		
		if (Arrays.equals(c, d)) {
			System.out.println(" Given String is Venic");
		}
		
		else {
			System.out.println(" Given String is not Venic");
		}
	}
}
