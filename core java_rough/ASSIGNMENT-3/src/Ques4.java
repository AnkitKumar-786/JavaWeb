import java.util.Collections;
import java.util.Scanner;

public class Ques4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		HashMapExample p1 = new HashMapExample();
		p1.createBooks();
		
		do {
			p1.reducePrice();
			System.out.println();
			System.out.println(
					"Choices\nDisplay Details: 1\nUpdate Details: 2\nDelete Books: 3\nQuit : 4\nDisplay All: 5\nCreate New Book: 6\n");
			System.out.print("Enter your Choice: ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.print("You want to Search the Book by Name or ID: ");
				String sChoice = sc.next();
				if (sChoice.equalsIgnoreCase("id")) {
					System.out.print("Enter the Book ID to Display: ");
					int id = sc.nextInt();
					p1.displayBookByID(id);
				} else {
					System.out.print("Enter the Player Book Name to Display: ");
					String bName = sc.next();
					p1.displayBookByName(bName);
				}
			} else if (choice == 2) {
				System.out.print("Enter the Book Name to Update: ");
				String name = sc.next();
				System.out.print("Enter the Field You want to Update: ");
				String update = sc.next();
				p1.updateDetails(name.toLowerCase(), update);
			} else if (choice == 3) {
				System.out.print("Enter the Book Name to Delete: ");
				String bName = sc.next();
				p1.deleteBook(bName);
			} else if (choice == 4) {
				sc.close();
				System.exit(0);
			} else if (choice == 5) {
				p1.displayForEach();
			} else if (choice == 6) {
				p1.addNewBook();
				p1.reducePrice();
			} 
		} while (true);
		
	}
}

