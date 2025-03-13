package javaCorePrac;

public class InterfaceMain {

	public static void main(String[]args) {
		
		BankAccount ba = new BankAccount();
		
		ba.rupees();
		ba.dollars();
		ba.pounds();
		
		ba.euro();
		ba.Cash();
		
		CreditCard.thanks();
	}
}
