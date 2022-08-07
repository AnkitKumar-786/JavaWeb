import java.util.Scanner;

public class Emp
{
	int empno;
	String empname;
	String designation;
	String dept;
	float salary;
	
	void readEmpData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Emp details :");
		empno=sc.nextInt();
		empname=sc.next();
		designation=sc.next();
		dept=sc.next();
		salary=sc.nextFloat();
	}
	
	void displayEmpData()
	{
		System.out.println("Details of Employee are :");
		System.out.println(empno);
		System.out.println(empname);
		System.out.println(designation);
		System.out.println(dept);
		System.out.println(salary);
	}
	void checkData()
	{
		
		if(designation.toUpperCase().equals("MANAGER"))
		{
			salary+= salary*0.25f;
		}
	}
	
	public static void main(String[] args) 
	{
		Emp e1 = new Emp();
		e1.readEmpData();
		e1.checkData();
		e1.displayEmpData();
		
	}
		
}
		
	
		
	


