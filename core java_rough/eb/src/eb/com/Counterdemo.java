package eb.com;

public class Counterdemo {

	static int count = 10;
		
		Counterdemo()
		{
			count++;
			System.out.println(count);
		}
		
		public static void main(String[] args) {
			
		Counterdemo cd1 = new Counterdemo();
		Counterdemo cd2 = new Counterdemo();
		Counterdemo cd3 = new Counterdemo();

	}

}
