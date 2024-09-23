package org.acumen.training.codes.iteme;

/*
 * Description: Checks if a triangle is isoceles or not
 * Author: Michael Dave Sumang
 * Date: September 23, 2024
 * */
public class Isoceles {
	public boolean isIsoceles(int sideOne, int sideTwo, int sideThree) {
		if(sideOne == sideTwo) {
			if(sideOne == sideThree) {
				return false;
			}
		} else if (sideOne == sideThree) {
			if(sideOne == sideTwo) {
				return false;
			}
			
		} else if (sideTwo == sideThree) {
			if(sideTwo == sideOne) {
				return false;
			}
		} else {
			return false;
		}
		return true;
	}

}
