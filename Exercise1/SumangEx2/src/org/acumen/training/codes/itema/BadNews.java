package org.acumen.training.codes.itema;

/*
 * Description: Outputs all odd number from 1-21 and 1-11
 * Author: Michael Dave Sumang
 * Date: September 23, 2024
 * */
public class BadNews {
	public static int maxOdd = 21;
	
	public static void writeOdds() {
		// print each odd number
		for (int count = 1; count <= maxOdd; count+=2) {
		System.out.print(count + " ");
	}
		System.out.println(); //new line after last number
	}
	
	public void run() {
		// write all odds up to 21
		writeOdds();
		// now, write all odds up to 11
		maxOdd = 11;
		writeOdds();
	}
}
