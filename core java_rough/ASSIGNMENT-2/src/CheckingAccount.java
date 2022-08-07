
public class CheckingAccount extends BankAccount
{
	float fee;
	CheckingAccount(String accNo, float bal, float fee)
	{
		super(accNo, bal);
		this.fee=fee;
	}
	
	void deductFee() 
	{
		super.withdraw(fee);
		System.out.println(fee+" Rupees Deducted");
		
	}
}

