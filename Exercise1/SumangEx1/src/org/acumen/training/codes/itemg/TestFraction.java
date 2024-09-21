package org.acumen.training.codes.itemg;

/*
Description: Test of Fraction class
Author: Michael Dave Sumang
Date: September 21, 2024
*/
public class TestFraction {
	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		
		f1.numerator = 10;
		f1.denominator = 23;
		
		f2.numerator = 2;
		f2.denominator = 3;
		
		f1.printRational();
		f2.printRational();
		
		System.out.println("f1 + f2 = "+ f2.add(f1));
		System.out.println("f1 * f2 = "+ f2.multiply(f1));
		System.out.println("is f1 greater than f2:"+ f2.greaterEqual(f1));
		
	}

}
