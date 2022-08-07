import java.io.*;
import java.util.*;
public class Student implements Serializable
{
//	private static final long serialVersionUID = 1L;
	int id;
	String subject, name, result;
	float marks;
	public Student(int id, String name, String subject, float marks) {
		this.id = id;
		this.subject = subject;
		this.name = name;
		this.marks = marks;
		this.resultCal();
	}
	
	void resultCal() {
		if (this.marks>=40){
			this.result="PASS";
		}else {
			this.result="FAIL";
		}
	}
	
	@Override
	public String toString() {
		return ("Student ID: "+ id+", Name: "+name+", Subject: "+subject+", Marks: "+marks+", Result: "+result);
	}
}

class WriteObject {
	static Scanner sc = new Scanner(System.in);
	static List<Student> al = new ArrayList<>();
	
	void createFile(String fname) throws IOException {
		File f0 = new File(fname);
		if (f0.createNewFile()) {
			System.out.println("File Created");
		}else {
			System.out.println("File Exists");
		}
	}
	
	void createStudent(int num) {
		for(int i=0;i<num;i++) {
			System.out.println("Enter the Details of Student: "+(i+1));
			System.out.print("Enter the Student ID: ");
			int id = sc.nextInt();
			System.out.print("Enter the Student Name: ");
			String sname = sc.next();
			System.out.print("Enter the Subject: ");
			String sub = sc.next();
			System.out.print("Enter the Marks: ");
			int marks = sc.nextInt();
			Student s = new Student(id, sname, sub, marks);
			al.add(s);
		}
	}
	
	void enterData() throws IOException {
		System.out.print("Enter the File Name from which you want to Read CSV data: ");
		String fnameCSV = sc.next();
		FileReader fileRead = new FileReader(fnameCSV);
		BufferedReader b = new BufferedReader(fileRead);
		String line;
		b.readLine();
		while ((line=b.readLine())!=null) {
			String[] strArr;
			strArr = line.split(",");
			int id = Integer.parseInt(strArr[0]);
			float marks = Float.parseFloat(strArr[3]);
			Student s = new Student(id, strArr[1], strArr[2], marks);
			al.add(s);
			System.out.println("Student "+ strArr[1]+" added");
		}
	}
	
	public static void main(String[] args) throws Exception{
		WriteObject f0 = new WriteObject();
		f0.enterData();
		System.out.println("Enter the File Name which you want to Create to store Object with Extension: ");
		String fname = sc.next();
		f0.createFile(fname);
//		System.out.println("Enter Number of Students: ");
//		int num = sc.nextInt();
//		f0.createStudent(num);
		FileOutputStream fos = new FileOutputStream(fname);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		System.out.println("Written");
		oos.close();
		fos.close();
	}
	
}
