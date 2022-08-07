

public class Employee {
	
	
	private String SSN, FirstName, LastName;
	String getSSN() {
		System.out.println("SSN: "+SSN);
		return SSN;
	}
	String getFirstName() { 
		System.out.println("FirstName: "+FirstName);
		return FirstName;
	}
	String getLastName() {
		System.out.println("LastName: "+LastName);
		return LastName;
	}
	void setSSN(String ssn) {
		SSN=ssn;
		System.out.println("SSN: "+SSN);
	}
	void setFirstName(String fname) {
		FirstName=fname;
		System.out.println("FirstName: "+FirstName);
	}
	void setLastName(String lname) {
		LastName=lname;
		System.out.println("LastName: "+LastName);
	}
	Employee(String ssn, String fname, String lname){
		SSN=ssn;
		FirstName=fname;
		LastName=lname;
	}
	
	void displayEmp() {
		System.out.println(FirstName+" "+LastName+" "+SSN);
	}
	
}

class HourlyEmployee extends Employee
{
	
	
	
	private float Salary;
	float HRA=1000, basicPay=3000;
	HourlyEmployee(String ssn, String fname, String lname, float sal){
		super(ssn,fname,lname);
		Salary=sal;
	}
	
	float getSalary(){
		System.out.println("Salary: "+ Salary);
		return Salary;
	}
	
	void setSalary(float sal) {
		Salary= sal;
		System.out.println("Salary: "+ Salary);
	}
	
	void computeGrossPay(){
		System.out.println("Gross Pay: "+(Salary+HRA));
	}
	
	void computeNetPay() {
		System.out.println("Net Pay: "+(Salary+HRA+basicPay));
	}
	
	void print() {
		System.out.println("Hourly Employee: ");
		System.out.println(getSSN()+" "+getFirstName()+" "+getLastName());
	}
}


class SalariedEmployee extends Employee{
	private float Salary;
	float HRA=2000, basicPay=4000;
	SalariedEmployee(String ssn, String fname, String lname, float sal){
		super(ssn,fname,lname);
		Salary=sal;
	}
	
	float getSalary(){
		System.out.println("Salary: "+ Salary);
		return Salary;
	}
	
	void setSalary(float sal) {
		Salary= sal;
		System.out.println("Salary: "+ Salary);
	}
	
	void computeGrossPay(){
		System.out.println("Gross Pay: "+(Salary+HRA));
	}
	
	void computeNetPay() {
		System.out.println("Net Pay: "+(Salary+HRA+basicPay));
	}
	
	void print() {
		System.out.println("Hourly Employee: ");
		System.out.println(getSSN()+" "+getFirstName()+" "+getLastName());
	}
}

