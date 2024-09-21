package org.acumen.training.codes.itema;

/*
Description: This program is the corrected version of erroneous code 5.
			 It outputs parameters received from the main thread to the
			 printParameters method.
Author: Michael Dave Sumang
Date: September 21, 2024
*/

public class Parameters {
	public static void main(String[] args) {
		double firstNum = 867.5309;
		double secNum = 10.01;
		printParameters(firstNum, secNum);
	}
	
	/*
	Input parameters: double firstNum, double secNum
	Out parameters: void
	Description: prints parameters received from the main thread as well as
				 a local variable.
	*/
	public static void printParameters(double firstNum, double secNum) {
		int thirdNum = 5;
		System.out.println("x = " + firstNum + " and y = " + secNum);
		System.out.println("The value from main is: " + firstNum + secNum);
		System.out.println("z = " + thirdNum);
	}
}
