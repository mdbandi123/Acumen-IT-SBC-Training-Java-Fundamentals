package org.acumen.training.codes.itemb;

/*
 * Description: Test class of GeneralMethods
 * Author: Michael Dave Sumang
 * Date: September 23, 2024
 * */
public class TestGeneralMethods {
	public static void main(String[] args) {
		GeneralMethods testObj = new GeneralMethods();
		
		testObj.getPowersOfTwo();
		testObj.pingAlarm(2);
		System.out.println(testObj.computeSum100());
		System.out.println(testObj.getSumRange(2, 4));
		System.out.println(testObj.getMaxOfTwo(6, 5));
		System.out.println(testObj.getLargerValue(4.0, 3.1));
		System.err.println(testObj.getEvenelyDivisible(10, 2));
		System.err.println(testObj.getEvenelyDivisible(5, 10));
		System.err.println(testObj.getEvenelyDivisible(10, 3));
		System.err.println(testObj.getEvenelyDivisible(3, 10));
	}

}
