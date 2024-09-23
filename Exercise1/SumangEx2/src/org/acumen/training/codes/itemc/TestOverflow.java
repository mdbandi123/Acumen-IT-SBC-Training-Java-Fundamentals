package org.acumen.training.codes.itemc;

/*
 * Description: Test class for Overflow
 * Author: Michael Dave Sumang
 * Date: September 23, 2024
 * */
public class TestOverflow {
	public static void main(String[] args) {
		byte x = 100;
		byte y = 10;
		System.out.println(Overflow.sumOverflow(x,y));
		System.out.println(Overflow.sumOverflow(x,x));
	}

}
