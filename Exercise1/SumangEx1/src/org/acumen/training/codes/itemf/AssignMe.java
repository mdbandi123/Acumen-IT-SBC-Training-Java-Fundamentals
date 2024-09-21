package org.acumen.training.codes.itemf;

/*
Description: Declares x and y values and swaps them
Author: Michael Dave Sumang
Date: September 21, 2024
*/

public class AssignMe {
	public static void main(String[] args) {
		int x;
		int y;
		int z; //temp variable to hold val of x when swapping
		
		x = 3;
		y = x*2;
		z = x;
		x = y;
		y = z;
		
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
		
	}
}
