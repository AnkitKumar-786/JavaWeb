import java.util.*;
class players{
	String name;
	int age, runs;
	static String countryName;
	
	players(String name, int age, int runs) {
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
			System.out.print("Enter the Name: ");
			String name = sc.next();
			System.out.print("Enter the Age: ");
			int age = sc.nextInt();
			System.out.print("Enter the Runs: ");
			int runs = sc.nextInt();
			pl[i] = new players(name, age, runs);
		}
		this.pl=pl;
	}
	
	void displayObj(int num) {
		pl[num].display();
	}
	
	void updateDetails(String search, String update) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<pl.length;i++) {
			if (pl[i].name.toLowerCase().equals(search)) {
				if (update.toLowerCase().equals("name")) {
					System.out.print("Enter the Updated Name: ");
					pl[i].name = sc.next();
					System.out.println("Name Updated");
				}else if (update.toLowerCase().equals("age")) {
					System.out.print("Enter the Updated Age: ");
					pl[i].age = sc.nextInt();
					System.out.println("Age Updated");
				}else if (update.toLowerCase().equals("runs")) {
					System.out.print("Enter the Updated Runs: ");
					pl[i].runs = sc.nextInt();
					System.out.println("Runs Updated");
				}
			}
		//		else if (update.toLowerCase().equals("country")) {
		//			System.out.print("Enter the Updated Country Name: ");
		//			pl[num-1].countryName = sc.next();
		//			System.out.println("Country Name Updated");
		//		}
		}
	}
	
	void deletePlayer(int num) {
		if (num<pl.length) {
			players[] temp = new players[pl.length-1];
			for (int i=0,j=0; i<pl.length;i++) {
				if (i!=(num)) {
					temp[j++]=pl[i];
				}
			}
			pl=temp;
			System.out.println("Player Deleted");
		}else {
			System.out.println("Array Out of Bounds");
		}
	}
	
	void displayAll() {
		for (int i=0;i<pl.length;i++) {
			pl[i].display();
			System.out.println();
		}
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
				System.out.println("Choices\nDisplay Details: 1\nUpdate Details: 2\nDelete Players: 3\nQuit : 4\nDisplay All: 5\n");
				System.out.print("Enter your Choice: ");
				int choice = sc.nextInt();
				if (choice == 1){
					System.out.print("Enter the Player Name to Display: ");
					String pName = sc.next();
					for(int i=0;i<pl.length;i++) {
						if (pl[i].name.toLowerCase().equals(pName.toLowerCase())) {
							p1.displayObj(i);
							break;
						}
					}
				}else if (choice == 2) {
					System.out.print("Enter the Player name to Update: ");
					String name = sc.next();
					System.out.print("Enter the Field You want to Update: ");
					String update = sc.next();
					p1.updateDetails(name.toLowerCase(), update);
					
				}else if(choice == 3) {
					System.out.print("Enter the Player Name to Delete: ");
					String playerName = sc.next();
					for(int i=0;i<pl.length;i++) {
						if (pl[i].name.toLowerCase().equals(playerName.toLowerCase())) {
							p1.deletePlayer(i);
							break;
						}
					}
					
				}else if (choice==4) {
					System.exit(0);
				}else if (choice==5) {
					p1.displayAll();
				}
		}while(true);
	}
}


