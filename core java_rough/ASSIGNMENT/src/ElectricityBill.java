import java.util.Scanner;

public class ElectricityBill
{
	int custNum;
	float unitsConsume, units, bill;
	String custName;
	
	void readData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details:");
		custNum = sc.nextInt();
		custName = sc.next();
		unitsConsume = sc.nextFloat();
		}
	
	void showData()
	{
		System.out.println("Customer ID:"+ custNum);
		System.out.println("Customer Name:"+ custName);
		System.out.println("Units Consumed:"+ unitsConsume);
		System.out.println("Customer Bill:"+ bill);
	}
	
	void computeBill()
	{
		units=unitsConsume;
		while(units > 0)
		{
			if(units > 600)
			{
				bill = ((units-600)* 5.00f);
				units= units-(units-600);
			}
			else if(units > 300)
			{
				bill += ((units-300)* 3.00f);
				units = units-(units - 300);
			}
			else if(units > 100)
			{
				bill += ((units-100)* 2.00f);
						units= units- (units - 100);
			}
			else if (units > 0)
			{
				bill += (units*1.20f);
				units = units -100;
			}
		}
	}
	public static void main(String[] args) 
	{
		ElectricityBill e1 = new ElectricityBill();
		e1.readData();
		e1.computeBill();
		e1.showData();
		
	}
			
		
	}

	


