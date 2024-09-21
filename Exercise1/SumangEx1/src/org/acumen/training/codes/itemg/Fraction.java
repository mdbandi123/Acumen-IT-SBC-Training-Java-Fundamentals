package org.acumen.training.codes.itemg;

/*
Description: Fraction class that can perform add, multiply, 
	equality check and print.
Author: Michael Dave Sumang
Date: September 21, 2024
*/
public class Fraction {
	public int numerator;
	public int denominator;
	
	/*
	input: none
	output: void
	description: prints fraction in rational form 
	*/
	public void printRational() {
		System.out.println(this.numerator +"/"+this.denominator); 
	}
	
	
	/*
	input: Fraction fraction
	output: String
	description: return sum of fractions 
	*/
	public String add(Fraction fraction) {
		int commonDenom = this.denominator * fraction.denominator;
		int newNumOne = this.numerator * fraction.denominator;
		int newNumTwo = fraction.numerator * this.denominator;
		
		int numSum = newNumOne + newNumTwo;
		
		return numSum + "/" + commonDenom;
	}
	
	/*
	input: Fraction fraction
	output: String
	description: return product of fractions 
	*/
	public String multiply(Fraction fraction) {
		int numProduct = this.numerator * fraction.numerator;
		int denomProduct = this.denominator * fraction.denominator;
		return numProduct+ "/" + denomProduct;
	}
	
	
	/*
	input: Fraction fraction
	output: boolean
	description: performs equality check on two fractions 
	*/
	public boolean greaterEqual(Fraction fraction) {
		int newNumOne = this.numerator * fraction.denominator;
		int newNumTwo = fraction.numerator * this.denominator;
		
		if(newNumOne>newNumTwo) {
			return true;
		} else {
			return false;
		}
	}
}
