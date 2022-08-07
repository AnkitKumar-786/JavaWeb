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
	Scanner sc = new Scanner (System.in);
	void createObjects(players[] pl, int num) {
		for(int i=0; i<pl.length; i++) {
			System.out.println("Details of Player: "+ (i+1));
//			Scanner sc = new Scanner(System.in);
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
	
	void displayObj(String pName) {
		int num=-1;
		for(int i=0;i<pl.length;i++) {
			if (pl[i].name.toLowerCase().equals(pName.toLowerCase())) {
				num=i;
				break;
			}
		}
		if (num!=-1) {
			pl[num].display();
		}else {
			System.out.println("No player with Such Name");
		}
	}
	
	void updateDetails(String search, String update) {
//		Scanner sc = new Scanner(System.in);
		int flag=-1;
		for (int i=0; i<pl.length;i++) {
			if (pl[i].name.toLowerCase().equals(search)) {
				flag=1;
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
		if (flag==-1) {
			System.out.println("No player with this Name");
		}
	}
	
	void deletePlayer(String playerName) {
		int num = -1;
		for(int i=0;i<pl.length;i++) {
			if (this.pl[i].name.toLowerCase().equals(playerName.toLowerCase())) {
				num=i;
				break;
			}
		}
		if (num<pl.length && num!=-1) {
			players[] temp = new players[pl.length-1];
			for (int i1=0,j=0; i1<pl.length;i1++) {
				if (i1!=(num)) {
					temp[j++]=pl[i1];
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
			this.pl[i].display();
			System.out.println();
		}
	}
	
	void createNew() {
		System.out.print("Enter the Number of players you want to create: ");
		int num = sc.nextInt();
		players[] temp = new players[num];
		for (int i=0; i<num;i++) {
			System.out.println("Details of Player: "+ (i+1));
//			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Name: ");
			String name = sc.next();
			System.out.print("Enter the Age: ");
			int age = sc.nextInt();
			System.out.print("Enter the Runs: ");
			int runs = sc.nextInt();
			temp[i] = new players(name, age, runs);
		}
		int pos=0;
		players[] res = new players[temp.length+pl.length];
		for (players element: pl) {
			res[pos] = element;
			pos++;
		}
		for(players element: temp) {
			res[pos] = element;
			pos++;
		}
		pl=res;
		System.out.println("Players Added");
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
				System.out.println("Choices\nDisplay Details: 1\nUpdate Details: 2\nDelete Players: 3\nQuit : 4\nDisplay All: 5\nCreate New Player: 6\n");
				System.out.print("Enter your Choice: ");
				int choice = sc.nextInt();
				if (choice == 1){
					System.out.print("Enter the Player Name to Display: ");
					String pName = sc.next();
					p1.displayObj(pName);
				}else if (choice == 2) {
					System.out.print("Enter the Player name to Update: ");
					String name = sc.next();
					System.out.print("Enter the Field You want to Update: ");
					String update = sc.next();
					p1.updateDetails(name.toLowerCase(), update);
					
				}else if(choice == 3) {
					System.out.print("Enter the Player Name to Delete: ");
					String playerName = sc.next();
					p1.deletePlayer(playerName);
				}else if (choice==4) {
					System.exit(0);
				}else if (choice==5) {
					p1.displayAll();
				}else if (choice==6) {
					p1.createNew();
				}
		}while(true);
	}
}
