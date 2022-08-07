import java.util.*;
public class Ques2
{
	public static void main(String[] args)
	{
		System.out.println("Enter SSN: ");
		Scanner sc = new Scanner(System.in);
		String ssn = sc.nextLine();
		System.out.println("Enter Full Name: ");
		String input = sc.nextLine();
		String arr[] = input.trim().split(" ");
		System.out.println("Enter Salary: ");
		int sal = sc.nextInt();
		System.out.println("Choices\nHourly Employee: 1\nSalaried Employee: 2\n");
		System.out.print("Enter your Choice: ");
		int choice = sc.nextInt();
		if (choice==1)
		{
			HourlyEmployee h1 = new HourlyEmployee(ssn, arr[0], arr[1], sal);
			h1.computeGrossPay();
			System.out.println("Enter the Updated First Name: ");
			String Name=sc.next();
			h1.setFirstName(Name);
			h1.getSalary();
			h1.computeNetPay();
		}
		else
		{
			SalariedEmployee h1 = new SalariedEmployee(ssn, arr[0], arr[1], sal);
			h1.computeGrossPay();
			System.out.println("Enter the Updated First Name: ");
			String Name=sc.next();
			h1.setFirstName(Name);
			h1.getSalary();
			h1.computeNetPay();
		}
		
	}
}

