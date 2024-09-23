package org.acumen.training.codes.iteme;

/*
 * Description: Test class for Isoceles
 * Author: Michael Dave Sumang
 * Date: September 23, 2024
 * */
public class TestIsoceles {
	public static void main(String[] args) {
		Isoceles iso = new Isoceles();
		boolean sampOne = iso.isIsoceles(1,1,2);
		boolean sampTwo = iso.isIsoceles(1,1,1);
		boolean sampThree = iso.isIsoceles(1,3,3);
		boolean sampFour = iso.isIsoceles(12,3,12);
		boolean sampFive = iso.isIsoceles(12,10,11);	
		System.out.println(sampOne);
		System.out.println(sampTwo);
		System.out.println(sampThree);
		System.out.println(sampFour);
		System.out.println(sampFive);
	}

}
