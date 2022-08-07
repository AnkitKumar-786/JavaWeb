import java.util.*;

public class FileExampleMain {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		FileExample f0 = new FileExample();
		System.out.println("Enter the File Name which you want to Create with Extension: ");
		String fname = sc.next();
		f0.createFile(fname);
//		f0.writeFile(fname);
		f0.fileDetails(fname);
		f0.readFile(fname);
		System.out.println("Enter word For Searching: ");
		String word = sc.next();
		f0.searchWord(fname, word);
//		f0.deleteFile(fname);
		sc.close();
//		f0.deleteFile("abc");
	}
}

