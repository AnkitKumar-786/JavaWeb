import java.util.*;

class Book{
	String name, authorName, publication, isbnNumber;
	float price;
	int bookID;
	boolean flagPrice;
	
	public Book(int bookID, String name, String authorName, String publication, String isbnNumber, float price) {
		this.bookID = bookID;
		this.name = name;
		this.authorName = authorName;
		this.publication = publication;
		this.isbnNumber = isbnNumber;
		this.price = price;
		this.flagPrice=false;
	}
	
	@Override
	public String toString() {
		return("Book ID: "+bookID+", Book Name: "+ name+ ", Author Name: "+ authorName+ ", Publication: "+publication+", Price: "+price);
	}
	
}

public class HashMapExample {
	static Scanner sc = new Scanner(System.in);
	static Map<Integer, Book> bookMap = new HashMap<>();
	
	void createBooks() {
		System.out.println("Enter the Number of Books: ");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println("Enter the Details of Book: "+(i+1));
			System.out.print("Enter the Book Name: ");
			String name = sc.next();
			System.out.print("Enter the Author Name: ");
			String aname = sc.next();
			System.out.print("Enter the Publication: ");
			String pub = sc.next();
			System.out.print("Enter the ISBN Number: ");
			String isbn = sc.next();
			System.out.print("Enter the Price: ");
			float price = sc.nextFloat();
			Book b = new Book(i+1, name, aname, pub, isbn, price);
			bookMap.put(i+1, b);
		}	
	}
	
	void displayForEach() {
		bookMap.forEach((key, value)->{
			System.out.println(key+": "+value);
		});
	}
	
	void displayMapEntryClass() {
		for(Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
	
	void displayBookByName(String bookName) {
		for(Map.Entry<Integer, Book> ele: bookMap.entrySet()) {
			if (ele.getValue().name.equalsIgnoreCase(bookName)) {
				System.out.println(ele);
			}
		}
	}
	
	void displayBookByID(int id) {
		System.out.println(bookMap.get(id));
	}
	
	void reducePrice() {
		for(Map.Entry<Integer, Book> ele: bookMap.entrySet()) {
			if (ele.getValue().publication.equalsIgnoreCase("aayush") && ele.getValue().flagPrice==false) {
				ele.getValue().price-=(ele.getValue().price/10);
				ele.getValue().flagPrice=true;
			}
		}
	}
	
	
	void updateDetails(String bname, String field) {
		bookMap.forEach((key, value)->{
			if (value.name.equalsIgnoreCase(bname)) {
				if(field.equalsIgnoreCase("authorname")) {
					System.out.print("Enter the Updated Author Name: ");
					value.authorName = sc.next();
					System.out.println("Author Name Updated");
				}else if(field.equalsIgnoreCase("bookname")) {
					System.out.print("Enter the Updated Book Name: ");
					value.name = sc.next();
					System.out.println("Book Name Updated");
				}else if(field.equalsIgnoreCase("publication")) {
					System.out.print("Enter the Updated Publication Name: ");
					value.publication = sc.next();
					System.out.println("Publication Name Updated");
				}else if(field.equalsIgnoreCase("price")) {
					System.out.print("Enter the Updated Price: ");
					value.price = sc.nextFloat();
					System.out.println("Price Updated");
				}
			}
		});
	}
	
	void deleteBook(String bname) {
		Integer eleID = 0;
		for(Map.Entry<Integer, Book> ele: bookMap.entrySet()) {
			if (ele.getValue().name.equalsIgnoreCase(bname)) {
				eleID= ele.getKey();
			}
		}
		bookMap.remove(eleID);
		System.out.println("Book Removed!!");
	}
	
	void addNewBook() {
		System.out.println("Enter the Number of Books: ");
		int num = sc.nextInt();
		int len= bookMap.size();
		int count=0;
		for(int i=len; i<(len+num); i++) {
			System.out.println("Enter the Details of Book: "+(count+1));
			System.out.print("Enter the Book Name: ");
			String name = sc.next();
			System.out.print("Enter the Author Name: ");
			String aname = sc.next();
			System.out.print("Enter the Publication: ");
			String pub = sc.next();
			System.out.print("Enter the ISBN Number: ");
			String isbn = sc.next();
			System.out.print("Enter the Price: ");
			float price = sc.nextFloat();
			Book b = new Book(i+1, name, aname, pub, isbn, price);
			bookMap.put(i+1, b);
			count++;
		}
		System.out.println("Books Added");
	}
	
	
}

