import java.util.Scanner;

public class Student 
{
	int sid;
	String name;
	int mark;
	
	void readStudentData()
	{
		System.out.println("enter student data");
		Scanner sc = new Scanner(System.in);
		sid = sc.nextInt();
		name = sc.next();
		mark = sc.nextInt();
		
	}
	
	void displayStudent()
	{
		System.out.print(sid + " " +name+ " " + mark + " ");
	}
	
	 void findResult()
	  {
		  if(mark>40)
			  System.out.println("pass");
		  else
			  System.out.println("fail");
		  
		  
		  
	  }
	  
	  
	  public static void main(String[] args) 
	  {
		  Student s1 = new Student();
		  Student s2 = new Student();
		  
		  s1.readStudentData();
		  System.out.println("student data");
		  s1.displayStudent();
		  s1.findResult();
		  
		  
		  s2.readStudentData();
		  System.out.println("student data");
		  s2.displayStudent();
		  s2.findResult();
		  
		  
	
	  }
	
	
}

		
	
	
	



