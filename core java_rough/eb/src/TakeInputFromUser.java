import java.util.Scanner;

public class TakeInputFromUser {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur first name: ");
		String fname= sc.next();
		
		System.out.println("Enter ur second name: ");
		String lname= sc.next();
		
		System.out.println();
		
		System.out.println("Hello\n" +fname+" "+lname);
		

	}

}
