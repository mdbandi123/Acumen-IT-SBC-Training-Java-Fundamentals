package org.acumen.training.codes.itema;

/*
Description: This program is the corrected version of erroneous code 8.
			 It sets the values for 2 variables (firstNum and secondNum),
			 with seconNum's value being 1 more than firstNum, then prints
			 both.
Author: Michael Dave Sumang
Date: September 21, 2024
*/

public class Numbers {
	public static void main(String[] args) {
		double firstNum = 0;
		System.out.println("firstNum is " + firstNum);
		firstNum = 15.2; // set firstNum to 15.2
		System.out.println("x is now " + firstNum);
		double secNum = 0; 
		secNum = firstNum + 1; // set y to 1 more than x
		System.out.println("x and y are " + firstNum + " and " + secNum);
	}

}
