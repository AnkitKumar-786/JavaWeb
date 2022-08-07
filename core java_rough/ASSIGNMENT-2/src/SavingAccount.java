
public class SavingAccount extends BankAccount
{
	float intrestRate;
	
	SavingAccount(String accNo, float bal)
	{
		super(accNo, bal);
	}
	
	void addInterest(float rate)
	{
		intrestRate=rate;
		totalBalance+=(totalBalance*(rate/100));
		System.out.println("Interest Added");
		super.getBalance();
	}
}

