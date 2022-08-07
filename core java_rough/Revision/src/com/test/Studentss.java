package com.test;

class Org {
	
	int rollno;
	String name;
	
	void insertRecord(int r, String n) {
		
		rollno = r;
		name = n;
	}
	void displayInformation() {
		
		System.out.println(rollno + " "+ name);
	}
}
	
	public class Studentss {

	public static void main(String[] args) {
	
		Org o1 = new Org();
		Org o2 = new Org();
		
		o1.insertRecord(111, "Ram");
		o2.insertRecord(1111, "Krishna");
		
		o1.displayInformation();
		o2.displayInformation();

	}

}
