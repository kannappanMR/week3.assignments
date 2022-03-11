package week3.day2;

public class MyBank {

	public static void main(String[] args) {

		SBI obj = new SBI();
		obj.openAccount();
		obj.provideCreditCard();
		obj.provideDebitCard();
		
		RBI obj1 = new SBI();
		obj1.openAccount();
		obj1.provideDebitCard();
	}

	
}
