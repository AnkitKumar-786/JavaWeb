import java.io.*;
import java.util.*;

public class FileExample {
	Scanner sc = new Scanner(System.in);
	void createFile(String fname) throws IOException {
		File f0 = new File(fname);
		if (f0.createNewFile()==true) {
			System.out.println("File Created");
		}else {
			System.out.println("File Exists");
		}
	}
	
	void readFile(String fname) throws FileNotFoundException {
		FileReader f0 = new FileReader(fname);
		Scanner dataReader = new Scanner(f0);
		while (dataReader.hasNextLine()) {
			System.out.println(dataReader.nextLine());
		}
		dataReader.close();
	}
	
	void readFileBufferedReader (String fname) throws Exception {
		FileReader f0= new FileReader(fname);
		BufferedReader dataReader = new BufferedReader(f0);
		while (dataReader.readLine()!=null) {
			System.out.println(dataReader.readLine());
		}
		dataReader.close();
	}
	
	
	void writeFile(String fname) throws Exception {
		FileWriter f0 = new FileWriter(fname, true);
		System.out.println("Enter data to Write to File");
		String data = sc.nextLine();
		f0.write(data);
		System.out.println("Data Written Successfully");
		f0.close();
	}
	
	void deleteFile(String fname) {
		File f0 = new File(fname);
		if (f0.delete()==true) {
			System.out.println("File Deleted Successfully");
		}else {
			System.out.println("Some error");
		}
		
	}
	
	void fileDetails(String fname) throws IOException{
		int lineCount=0, wordCount=0, charCount=0;
//		String line;
		FileReader f0 = new FileReader(fname);
		BufferedReader b = new BufferedReader(f0);
//		while ((line = b.readLine())!=null) {
//			lineCount++;
//			String wordsArr[] = line.split(" ");
//			wordCount+=wordsArr.length;
//			for(String word: wordsArr) {
//				charCount+=word.length();
//			}
//		}
//		System.out.print("Number of Lines: "+ (lineCount));
//		System.out.print(", Number of Words: "+ (wordCount));
//		System.out.print(", Number of Characters: "+ charCount+"\n");
		
		int c;
		while ((c= b.read())!=-1) {
			c=(char)c;
			if(c=='\n') {
				lineCount++;
				wordCount++;
			}else if(c!=' ') {
				charCount++;
			}else {
				wordCount++;
			}
		}
		System.out.print("Number of Lines: "+ (lineCount+1));
		System.out.print(", Number of Words: "+ (wordCount+1));
		System.out.print(", Number of Characters: "+ charCount+"\n");
		b.close();
	}
	
	void searchWord(String fname, String word) throws IOException{
		String line;
		int lineCount=0;
		FileReader fread = new FileReader(fname);
		BufferedReader b = new BufferedReader(fread);
		while((line = b.readLine())!=null) {
			String[] words = line.split(" ");
			lineCount++;
			for (String ele :words) {
				if (ele.equalsIgnoreCase(word)) {
					System.out.println("Found Word At Line number: "+ lineCount);
					break;
				}
			}
		}
		b.close();
	}
}

