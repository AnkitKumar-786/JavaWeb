
public class Employee {

        int empid;
		String empname;
		static String Companies = "Elektrobit";
		
		Employee(int id, String name )
		{
		this.empid = id;
		this.empname= name;
		}
		
		 void display()
		{
			System.out.println(empid+ " "+ empname+ " "+ Companies);
		}
		
		
		public static void main(String[] args) 
		{
			Employee e1 = new Employee(10, "Ankit");
			
			e1.display();
			
			Employee e2 = new Employee(12, "Hemant");
			
			e2.display();
			
		}

	}


