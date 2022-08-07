
public class BankAccount 
{
	String accountNumber;
	float totalBalance;
	int counter=0;
	
	BankAccount(String accNo, float totBalance)
	{
		accountNumber = accNo;
		totalBalance = totBalance;
	}
	
	void deposit(float amt)
	{  
		totalBalance=totalBalance+amt;  
		System.out.println(amt+" deposited");  
	}  

	void withdraw(float amt)
	{  
		if(totalBalance<amt)
		{  
			System.out.println("Insufficient Balance");  
		}
		else
		{  
			totalBalance=totalBalance-amt;  
			System.out.println(amt+" withdrawn");  
		}  
	}
	
	void getBalance()
	{
		counter++;
		System.out.println("Balance of Account Number "+ accountNumber +" is: "+ totalBalance);
	}
}

