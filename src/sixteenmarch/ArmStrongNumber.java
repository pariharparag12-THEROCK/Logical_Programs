package sixteenmarch;

public class ArmStrongNumber {

	public static void main(String []args) {
		
		int n = 371;
		int temp = n;
		int s = 0;
		int t;
		
		while (temp>0) {
			
			t = temp%10; //1, 7, 3
			s = t*t*t+s; // 1, 344, 371
			temp = temp/10; // 37, 3, 0
			
		}
		
		if(n==s) {
			System.out.println("Given number is arm strong number : " + s);
		}
		
		else {
			System.out.println("Given number is not  arm strong number : " + s);
		}
		
	}
}
