package org.acumen.training.codes.itemb;

/*
 * Description: Class of utility methods.
 * Author: Michael Dave Sumang
 * Date: September 23, 2024
 * */
public class GeneralMethods {
	public void getPowersOfTwo() {
		System.out.println(2);
		for(byte i = 1; i < 10; i++) {
			int product = 2;
			for(byte j = 0; j<i; j++) {
				product = product * 2;
			}
			System.out.println(product);
		}
	}
	
	public void pingAlarm(int timesToPrint) {
		for(int i = 0; i<timesToPrint; i++) {
			System.out.println("Alarm!");
		}
	}
	
	public int computeSum100() {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public int getSumRange(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
	
	public int getMaxOfTwo(int numOne, int numTwo) {
		return (numOne > numTwo) ? numOne : numTwo;
	}
	
	public boolean getLargerValue(double numOne, double numTwo) {
		return (numOne>numTwo) ? true : false;
	}
	
	public boolean getEvenelyDivisible(int numOne, int numTwo) {
		return (numOne % numTwo == 0) || (numTwo % numOne == 0)? true : false;
	}
}
