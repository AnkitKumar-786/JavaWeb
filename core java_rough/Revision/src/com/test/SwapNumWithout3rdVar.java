package com.test;

public class SwapNumWithout3rdVar {

	public static void main(String[] args) {
		
		int x = 21;
		int y= 43;
		
		// swap logic
		x= x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x = " +x+ "," + "y = " + y);

	}

}
