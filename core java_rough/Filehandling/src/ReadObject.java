import java.io.*;
import java.util.*;

public class ReadObject {
	static int countPass=0;
	void studentsPass(Student s, String sub) {
		if (s.subject.equalsIgnoreCase(sub)) {
			if(s.result.equalsIgnoreCase("pass")) {
				countPass++;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		ReadObject r = new ReadObject();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the File Name from which you want to Read with Extension: ");
		String fname = sc.next();
		FileInputStream fos = new FileInputStream(fname);
		ObjectInputStream oos = new ObjectInputStream(fos);
		List<Student> al = new ArrayList<>();
		al = (ArrayList<Student>)oos.readObject();
		Comparator<Student> c =  new MarksComparator();
		Collections.sort(al, c);
		System.out.println("Enter the subject name in which you want to see Passed Students: ");
		String sub = sc.next();
		for(Student s: al) {
			System.out.println(s);
			r.studentsPass(s, sub);
		}
		System.out.println("Students Passed in "+sub+" are: "+countPass);
		System.out.println("Students Failed in "+sub+" are: "+(al.size()-countPass));
		sc.close();
		oos.close();
		fos.close();
	}
}

class MarksComparator implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		if(s1.marks<s2.marks)
			return 1;
		else if (s1.marks==s2.marks)
			return 0;
		else
			return -1;
	}
}

