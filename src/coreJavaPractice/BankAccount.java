package coreJavaPractice;

public class BankAccount implements MasterCard{

	@Override
	public void euro() {
		System.out.println("You can pay via EURO");
		
	}

	@Override
	public void ruppess() {
		System.out.println("You can pay via RUPEES");
		
	}

	@Override
	public void dollars() {
		System.out.println("You can pay via DOLLARS");
		
	}

	@Override
	public void pounds() {
		System.out.println("You can pay via POUNDS");
		
	}

	@Override
	public void cash() {
		System.out.println("You can pay via CASH");
		
	}
	
	public static void main(String[] args) {
		BankAccount orv = new BankAccount();
		
		orv.cash();
		orv.dollars();
		orv.pounds();
		orv.ruppess();
		orv.euro();
	
		
		CreditCard.thanks();
		orv.yen();
	}

	@Override
	public void yen() {
		System.out.println("You can pay via YEN");
		
	}

}
