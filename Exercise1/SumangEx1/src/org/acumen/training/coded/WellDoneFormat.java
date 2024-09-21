package org.acumen.training.coded;

/*
Description: Prints a message regarding a well formed java program
Author: Michael Dave Sumang
Date: September 21, 2024
*/

public class WellDoneFormat {
	
	/*
	input: none
	output: void
	description: outputs 5 print statements that form a complete message
				 about a well formed java program.
	*/
	public void printMessage() {
		System.out.println("A well-formed Java program has a main");
		System.out.println("method with { and } braces.");
		System.out.println("A System.out.println statement has ( and )");
		System.out.println("and usually a String that starts and ends");
		System.out.println("with a \" character. (But we type \\\" instead!)");
	}
	
	public static void main(String[] args) {
		WellDoneFormat message = new WellDoneFormat();
		message.printMessage();
	}

}
