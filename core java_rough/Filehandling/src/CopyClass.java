import java.io.*;
import java.util.*;

public class CopyClass {

	BufferedReader createFile(String fname) throws FileNotFoundException  {
		File f0 = new File(fname);
		try {
			if (f0.createNewFile()) {
				System.out.println("File Created");
			} else {
				System.out.println("File Exists");
			}
		} catch (IOException e) {
			System.out.println("Some Error");
		}
		FileReader f1 = new FileReader(f0);
		BufferedReader b = new BufferedReader(f1);
		return b;
	}

	void readFile(String fname) throws IOException{
		FileReader f1 = new FileReader(fname);
		BufferedReader b = new BufferedReader(f1);
		String line;
		while ((line=b.readLine())!=null) {
			System.out.println(line);
		}
		b.close();
	}
	
	public static void main(String[] args) throws IOException{
		CopyClass c = new CopyClass();
		String line;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Source File Name with Extension: ");
		String fname = sc.next();
		BufferedReader source = c.createFile(fname);
		System.out.println("Enter the Destination File Name with Extension: ");
		String destFile = sc.next();
		FileWriter dest = new FileWriter(destFile);
		while ((line = source.readLine())!=null) {
			System.out.println(line);
			dest.write(line+"\n");
		}
		dest.close();
		source.close();
	}

}
