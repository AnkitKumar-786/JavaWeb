package com.test;
import java.util.ArrayList;
import java.util.List;

// input:" My name is Ankit"
// output:" Ankit is name My"

public class StringWordsRev {
public static void main(String[] args) {
		
		String ip = "My name is Ankit";
		List<String> str = new ArrayList<>();
		String s = "";
		
		for(int i=0; i<ip.length(); i++) {
			
			if(ip.charAt(i) != ' ') {
				s = s + ip.charAt(i);
			}
			else {
				str.add(s);
				s = "";
			}
		}
		str.add(s);
		for(int j=0; j<str.size(); j++) {
			System.out.print(str.get(j) + " ");
		}
		System.out.println(" ");
		
		for(int j = str.size()-1; j>=0; j--) {
			System.out.print(str.get(j) + " ");
		}

	}

}
