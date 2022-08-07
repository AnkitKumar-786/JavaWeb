import java.util.*;
class acc {
	String accno, accname;
	float amount;
	
	acc(String accno, String accname, float amount) {
		this.accno=accno;
		this.accname=accname;
		this.amount=amount;
	}
	
	void deposit(float amt){  
			amount=amount+amt;  
			System.out.println(amt+" deposited");  
		}  
	
	void withdraw(float amt){  
		if(amount<amt){  
			System.out.println("Insufficient Balance");  
		}else{  
			amount=amount-amt;  
			System.out.println(amt+" withdrawn");  
			}  
	}  
	
	void interest(float rate) {
		amount+=(amount*(rate/100));	
	}
	
	void display() {
		System.out.println("Account Number: "+ accno);
		System.out.println("Account Holder Name: "+ accname);
		System.out.println("Balance: "+ amount);
	}
	
}

public class Account{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details: ");
		String accno = sc.next();
		String accname = sc.next();
		float amount = sc.nextFloat();
		acc ac = new acc(accno, accname, amount);
		ac.deposit(30000);
		ac.interest(10);
		ac.withdraw(10000);
		ac.display();
	}
}