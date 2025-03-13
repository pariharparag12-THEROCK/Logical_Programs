package javaCorePrac;

public class Abstraction {

	public static void main(String[] args) {
		
		PersonalDetails.welcome();
		
		SBI orv1 = new SBI();
		orv1.name();
		orv1.accountNumber();
		//orv1.welcome();
		
		HDFC orv2 = new HDFC();
		orv2.name();
		orv2.accountNumber();
		//orv2.welcome();
		
	}

}
