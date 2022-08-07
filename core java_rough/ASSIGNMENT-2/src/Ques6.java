import java.util.Scanner;

public class Ques6 {
	static CreditCard createObjectFactory(int choice, String cardNo, String name, float bal) {
		if (choice==1) {
			return new Rupees(cardNo, name, bal);
		}else if(choice==2) {
			return new Dollars(cardNo, name, bal);
		}else if(choice ==3) {
			return new Pounds(cardNo, name, bal);
		}
		return null;
	}
	
	public static void main(String[] args) {
		CreditCard c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Card Number: ");
		String cardNo = sc.next();
		System.out.print("Enter the Name: ");
		String name = sc.next();
		System.out.print("Enter the Balance in Rupees: ");
		float bal = sc.nextFloat();
		System.out.println("Pay in\nRupees: 1\nDollars: 2\nPounds: 3");
		System.out.print("Enter the Choice: ");
		int choice = sc.nextInt();
		c = createObjectFactory(choice, cardNo, name, bal);
		System.out.println(c.getClass().getName());
		if (c.getClass().getName().equals("Rupees")) {
			System.out.print("Enter Amount to be Paid in Rupees: ");
		}else if(c.getClass().getName().equals("Dollars")) {
			System.out.print("Enter Amount to be Paid in Dollars: ");
		}else if(c.getClass().getName().equals("Pounds")) {
			System.out.print("Enter Amount to be Paid in Pounds: ");
		}
		float amt =  sc.nextFloat();
		c.payment(amt);
	}
}

