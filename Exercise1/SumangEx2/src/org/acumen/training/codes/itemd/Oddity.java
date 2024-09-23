package org.acumen.training.codes.itemd;

/*
 * Description: Checks if all digits in an int are odd
 * Author: Michael Dave Sumang
 * Date: September 23, 2024
 * */
public class Oddity {
 public boolean allDigitsOdd(int number) {
	 String numAsString = Integer.toString(number); //converts int to string
	 for(int i=0; i<numAsString.length(); i++) {
		 //iterates over numeric string sequence and parses int value
		 int stringAsNum = Character.getNumericValue(numAsString.charAt(i));
		 if(stringAsNum % 2 == 0) {
			 return false;
		 }
	 }
	 return true;
 }
}
