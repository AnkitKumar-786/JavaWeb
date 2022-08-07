import java.util.*;
class players{
	String name;
	int age, runs, id;
	static String countryName;
	
	players(int id, String name, int age, int runs) {
		this.id = id;
		this.name=name;
		this.age=age;
		this.runs=runs;
	}
	
	static {
		countryName = "INDIA";
	}
	
	void display() {
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Total Runs: "+ runs);
		System.out.println("Country Name: "+ countryName);
	}
	
}


public class Player {
	players[] pl;
	
	void createObjects(players[] pl, int num) {
		for(int i=0; i<pl.length; i++) {
			System.out.println("Details of Player: "+ (i+1));
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the ID: ");
			int id = sc.nextInt();
			System.out.print("Enter the Name: ");
			String name = sc.next();
			System.out.print("Enter the Age: ");
			int age = sc.nextInt();
			System.out.print("Enter the Runs: ");
			int runs = sc.nextInt();
			pl[i] = new players(id, name, age, runs);
		}
		this.pl=pl;
	}
	
	void displayObj(int num) {
//		for(int i=0; i<2; i++) {
//			System.out.println("Details of Player: "+ (i+1));
//			pl[i].display();
//		}
		pl[num].display();
	}
	
	public static void main(String[] args) {
			Player p1 = new Player();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Number of Objects: ");
			int n = sc.nextInt();
			players[] pl = new players[n];
			p1.createObjects(pl, n);
			do {
				System.out.println();
				System.out.println("Choices\nDisplay Details: 1\nUpdate Details: 2\nDelete Players: 3\nQuit : 4");
				System.out.print("Enter your Choice: ");
				int choice = sc.nextInt();
				if (choice == 1){
					System.out.print("Player ID to Display: ");
					int num = sc.nextInt();
					if (num-1<= n) {
						p1.displayObj(num-1);
					}else {
						System.out.println("Array Out of Bounds");
					}
				}else if (choice == 2) {
					System.out.print("Enter the Player number to Update: ");
					int num = sc.nextInt();
					System.out.println("Enter the Field You want to Update: ");
					String update = sc.next();
					if (update.toLowerCase().equals("Name")) {
						System.out.print("Enter the Updated Name: ");
						pl[num-1].name = sc.next();
						System.out.println("Name Updated");
					}else if (update.toLowerCase().equals("age")) {
						System.out.print("Enter the Updated Age: ");
						pl[num-1].age = sc.nextInt();
						System.out.println("Age Updated");
					}else if (update.toLowerCase().equals("runs")) {
						System.out.print("Enter the Updated Runs: ");
						pl[num-1].runs = sc.nextInt();
						System.out.println("Runs Updated");
					}
//					else if (update.toLowerCase().equals("country")) {
//						System.out.print("Enter the Updated Country Name: ");
//						pl[num-1].countryName = sc.next();
//						System.out.println("Country Name Updated");
//					}
				}else if(choice == 3) {
					System.out.print("Enter the Player number to Delete: ");
					int num = sc.nextInt();
					if (num<pl.length) {
						players[] temp = new players[pl.length-1];
						for (int i=0,j=0; i<pl.length;i++) {
							if (i!=(num-1)) {
								temp[j++]=pl[i];
							}
						}
						pl=temp;
						System.out.println("Player Deleted");
					}else {
						System.out.println("Array Out of Bounds");
					}
					
				}else if (choice==4) {
					System.exit(0);
				}				
		}while(true);
	}
}
