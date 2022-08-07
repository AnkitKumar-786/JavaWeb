package eb.com;

public class Rest {
	int age;
	String name;
	
	public Rest(int age,String name)
	{
		this.age=age;
		this.name=name;
		
	}
	
    public static void main(String[] args) 
	{
    	Rest r = new Rest(10 , "ram");
    	System.out.println(r.name +" "+ r.age );
		
		

	}

}
