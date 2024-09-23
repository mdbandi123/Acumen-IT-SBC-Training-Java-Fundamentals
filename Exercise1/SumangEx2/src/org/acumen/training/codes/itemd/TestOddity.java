package org.acumen.training.codes.itemd;

/*
 * Description: Test class for Oddity
 * Author: Michael Dave Sumang
 * Date: September 23, 2024
 * */
public class TestOddity {
	public static void main(String[] args) {
		Oddity oddity = new Oddity();
		System.out.println(oddity.allDigitsOdd(135319));
		System.out.println(oddity.allDigitsOdd(9145293));
		System.out.println(oddity.allDigitsOdd(10));
	}

}
