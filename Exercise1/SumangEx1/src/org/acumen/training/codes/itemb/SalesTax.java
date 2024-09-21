package org.acumen.training.codes.itemb;

/*
Description: SalesTax class that computes due amount.
Author: Michael Dave Sumang
Date: September 21, 2024
*/
public class SalesTax {
	public final double STATE_SALE_TAX = 0.04;
	public final double COUNTY_SALE_TAX = 0.02;
	public double itemCost;
	public double stateSaleTaxDue;
	public double countySaleTaxDue;
	public double totalAmountDue;
	
	/*
	input: double amount
	output: void
	description: takes amount and computes state and country sales tax as well
	 			 as total amount due.
	*/
	public void computeCost(double itemCost) {
		this.itemCost = itemCost;
		
		if(this.itemCost < 0) { //early return for negative item cost.
			return;
		}
		
		this.stateSaleTaxDue = this.itemCost * this.STATE_SALE_TAX;
		this.countySaleTaxDue = this.itemCost * this.COUNTY_SALE_TAX;
		this.totalAmountDue = this.itemCost + this.stateSaleTaxDue + this.countySaleTaxDue;
		
	}
}
