package org.acumen.training.codes.itema;

/*
Description: This program is the corrected version of erroneous code 6.
			 It creates an Exercise object then increments and prints its
			 num instance variable.
Author: Michael Dave Sumang
Date: September 21, 2024
*/

public class Exercise {
	private int num = 101;
	
	/*
	Input parameters: int num
	Out parameters: void
	Description: increments instance variable num by its num argument.
				 Calls printNum() after the calculation.
	*/
	private void incrementNum(int num) {
		this.num+=num;
		printNum();
	}
	
	/*
	Input parameters: none
	Out parameters: void
	Description: prints instance variable num.
	*/
	private void printNum() {
		System.out.println(this.num);
	}
	
	public static void main(String[] args) {
		Exercise exerciseObj = new Exercise();
		int num = 200;
		exerciseObj.incrementNum(num);
	}
}
