package com.test;

public class Palindrome {

	public static void main(String[] args) {
		int sum=0, temp, r;
		
		int n= 121; // no.variable to be checked for palindrome
		
		temp = n;
		while(n>0) {
			
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		
		if(temp == sum)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome");

	}

}
