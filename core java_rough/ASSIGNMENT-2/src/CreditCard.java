
public interface CreditCard {
	void payment(float amount);
}

class BankAccount1 {
	
	String cardno, name;
	float balance;

	BankAccount1(String cardno, String name, float balance) {
		this.cardno=cardno;
		this.name=name;
		this.balance=balance;
	}
	
	void display() {
		System.out.println("Name: "+name+", Card Number: "+cardno+", Balance: "+balance);
	}
	
}

class Rupees extends BankAccount1 implements CreditCard {

	Rupees(String cardno, String name, float balance) {
		super(cardno, name, balance);
	}

	@Override
	public void payment(float amt) {
		super.balance-=amt;
		System.out.println("Amount Paid in Rupees!!");
		super.display();
		System.out.println("Amount Paid: "+ amt);
	}
}


class Dollars extends BankAccount1 implements CreditCard {

	Dollars(String cardno, String name, float balance) {
		super(cardno, name, balance);
	}

	@Override
	public void payment(float amt) {
		amt=amt*80;
		super.balance-=amt;
		System.out.println("Amount Paid in Dollars!!");
		super.display();
		System.out.println("Amount Paid: "+ amt);
	}
}


class Pounds extends BankAccount1 implements CreditCard {

	Pounds(String cardno, String name, float balance) {
		super(cardno, name, balance);
	}

	@Override
	public void payment(float amt) {
		amt=amt*100;
		super.balance-=amt;
		System.out.println("Amount Paid in Pounds!!");
		super.display();
		System.out.println("Amount Paid: "+ amt);
	}
}

