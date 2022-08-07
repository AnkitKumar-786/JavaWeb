package eb.com;

import java.util.Scanner;
public class Product {

	public static void main(String[] args)
	{
		int pid;String pname; float price;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the product details");
		
		pid = sc.nextInt();
		pname = sc.next();
		price = sc.nextFloat();
		
		System.out.println(pid);
		System.out.println(pname);
		System.out.println(price);
		

	}

}
