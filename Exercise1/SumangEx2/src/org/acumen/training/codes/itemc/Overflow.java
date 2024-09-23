package org.acumen.training.codes.itemc;

/*
 * Description: Checks if two byte values go beyond the range 
 * 				-128 to 127, causing an overflow
 * Author: Michael Dave Sumang
 * Date: September 23, 2024
 * */
public class Overflow {
	public static boolean sumOverflow(byte x, byte y) {
		return ((byte)(x+y) < 0) ? true : false; //explicit byte cast
	}
}
