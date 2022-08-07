package com.test;
public class Encapsulation {

	public static void main(String[] args) {
	
		Employeess e = new Employeess();
		e.setName("Shiva");
		
		System.out.println(e.getName());
		

	}

}

class Employeess {
	private String empname;

	
	public String getName() {
		return empname;
	}
	
	public void setName(String empname) {
		this.empname = empname;
	}
	
	
	
	
}
