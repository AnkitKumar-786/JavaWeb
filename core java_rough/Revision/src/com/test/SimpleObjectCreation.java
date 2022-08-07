package com.test;

class Test
{
	int studid;
	String studname;
	int studno;
	
	public Test(int stdid,String stdname, int stdno)
	{
		this.studid= stdid;
		this.studname= stdname;
		this.studno= stdno;
		}
	
	public Test()
	{
		
	}
	
	public void studDetails()
	{
		
		
		System.out.println(studid +" "+ studname+ " "+ studno);
	}
	
}

public class SimpleObjectCreation 
{
	 public static void main(String[] args)
	 {
		 System.out.println("Details of Student are");
		 Test t = new Test(101, "Raj", 9450);
		 t.studDetails();
		
	

	}

}
