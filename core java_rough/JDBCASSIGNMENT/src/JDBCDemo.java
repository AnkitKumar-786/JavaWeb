import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class JDBCDemo 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest","root","@ks500628");
	System.out.println("connection established");
	for(int i=0;i<4;i++)
	{
	//PreparedStatement pmt = con.prepareStatement("select * from emp");
	PreparedStatement pmt = con.prepareStatement("insert into employee(empno,empname,salary) values(?,?,?)");
	
	
	Scanner sc = new Scanner(System.in);
	int empno=sc.nextInt();
	String empname=sc.next();
	float salary=sc.nextFloat();
	
	pmt.setInt(1, empno);
	pmt.setString(2, empname);
	pmt.setFloat(3, salary);
	
	pmt.executeUpdate();
	System.out.println("row inserted");
	
	}
	// create query
	
	//String  = "select * from emp";
	
	//execute the query
	
	//ResultSet rs =smt.executeQuery(q1);
	
	// iterate the result set
	
//	while(rs.next())
	//{
//		System.out.println(rs.getInt("emp.empcode") + " "+ rs.getString("emp.empname") + " "+rs.getFloat("emp.basicpay"));
//		
//	}
con.close();
	}
	
	
	

}
