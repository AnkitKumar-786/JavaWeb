import java.util.Scanner;

public class Welcome 
{
	
	public  String ccase(String name)
	{
		name=name.toUpperCase();
		return name;
	}
	
	
	public static void main(String[] args) 
	{
		String n;
		Welcome w = new Welcome();
	         
//		String name;                     
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name");
		
	 n=sc.next();             // takes the input from the user and stores it into n
		
		System.out.println("welcome ");
		String xyz=w.ccase(n);
		System.out.println("the word to be changed is "+ xyz);
		
	}

}
