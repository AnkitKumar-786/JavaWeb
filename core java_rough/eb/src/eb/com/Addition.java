package eb.com;

import java.util.Scanner;
public class Addition 
{
	public static int add(int a, int b) 
	{
		//float n1 = 40.5f;
		//float n2 = 50.5f;
		int sum;
		sum=a+b;
		return sum;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for n1");
		int n1= sc.nextInt();
		
		System.out.println("enter value for n2");
		int n2 = sc.nextInt();
		
		int total = add(n1,n2);
		System.out.println("sum of n1 and n2 "+ total);
		

	}

}
