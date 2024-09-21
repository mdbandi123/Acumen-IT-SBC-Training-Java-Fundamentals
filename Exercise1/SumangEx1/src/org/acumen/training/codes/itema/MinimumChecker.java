package org.acumen.training.codes.itema;

/*
Description: This program is the corrected version of erroneous code 1.
			 It checks who's smaller among two integer.
Author: Michael Dave Sumang
Date: September 21, 2024
*/

public class MinimumChecker {
	public static void main(String args[]) {
		int firstNum = 7; 
		int secNum = 42;
		
		int smallerNum = getMinimum(firstNum, secNum);
		
		if (smallerNum == firstNum) {
			System.out.println("firstNum is the smallest!");
		} else if (smallerNum == secNum) {
			System.out.println("secNum is the smallest!");
		} else {
			System.out.println("they are both the same number!");
		}
	}
	
	/*
	Input parameters: int firtNum, int secNum
	Out parameters: int
	Description: returns the smaller value among two integers
	*/
	public static int getMinimum(int firstNum, int secNum) {
		int smaller = 0;
		if (firstNum < secNum) {
			smaller = firstNum;
		} else if (firstNum > secNum) {
			smaller = secNum;
		} else {
			smaller = 0;
		}
		return smaller;
	}
}
