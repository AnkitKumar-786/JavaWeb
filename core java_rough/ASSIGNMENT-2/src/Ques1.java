import java.util.Scanner;

public class Ques1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Number: ");
		String acc = sc.next();
		System.out.println("Enter the Account Balance: ");
		float bal = sc.nextFloat();
		System.out.println("Choices\nChecking Account: 1\nSaving Account: 2\n");
		System.out.print("Enter your Choice: ");
		int choiceSavCheck = sc.nextInt();
		if (choiceSavCheck==1)
		{
			System.out.println("Enter the Fees to be Deducted: ");
			float fees=sc.nextFloat();
			CheckingAccount ca = new CheckingAccount(acc, bal, fees);
			do 
			{
				System.out.println();
				System.out.println("Choices\nDeposit: 1\nWithdraw: 2\nBalance: 3\nQuit : 4\n");
				System.out.print("Enter your Choice: ");
				int choice = sc.nextInt();
				
				if (choice==1) 
				{
					System.out.println("Enter the Amount to Deposit: ");
					float amt = sc.nextFloat();
					ca.deposit(amt);
				}
				else if(choice==2)
				{
					System.out.println("Enter the Amount to Withdraw: ");
					float amt = sc.nextFloat();
					ca.withdraw(amt);
				}
				else if(choice ==3)
				{
					if (ca.counter>2)
					{
						ca.deductFee();
					}
					ca.getBalance();
				}
				else if(choice==4) 
				{
					System.exit(0);
				}
			}
			while(true);
		}
		else
		{
			SavingAccount sa = new SavingAccount(acc, bal);
			System.out.println("Enter the Interest Rate: ");
			float rate = sc.nextFloat();
			sa.addInterest(rate);
		}
	}
}

