package com.test;

class Employee {
	
	float salary = 1000000;
}


public class Programmer extends Employee {
	
	int bonus = 500000;

	public static void main(String[] args) {
		
     Programmer obj = new Programmer();
     
     System.out.println("Programmer salary is  " + obj.salary);
     System.out.println("Programmer bonus is  " + obj.bonus);
	}

}
