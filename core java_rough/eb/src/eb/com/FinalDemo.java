package eb.com;

public class FinalDemo
{

	public static void main(String[] args) {
		
		int i = 8;
		i++;
		System.out.println(i);

		B obj = new B();
		obj.show();
	}
}
	
	
	class A
	{
		public void show()
		{
			System.out.println("in a parent");
		}
	}
	
	class B extends A
	{
		public void show()
		{
			System.out.println("in a child");
		}
	}
	


