package org.acumen.training.codes.itema;

/*
Description: This program is the corrected version of erroneous code 3.
			 It converts temperature from Fahrenheit to Celcius.
Author: Michael Dave Sumang
Date: September 21, 2024
*/

public class Temperature {
	public static void main(String[] args) {
		double tempInFahr = 98.6;
		double tempInCelc = 0.0;
		tempInCelc = convertFtoC(tempInFahr);
		System.out.println("Body temp in C is: " + tempInCelc);
	}
	
	/*
	Input parameters: double tempInFahr
	Out parameters: double
	Description: Converts Fahrenheit temperatures to Celsius and returns the value.
	 */
	public static double convertFtoC(double tempInFahr) {
		return (tempInFahr - 32) * 5 / 9;
	}
}
