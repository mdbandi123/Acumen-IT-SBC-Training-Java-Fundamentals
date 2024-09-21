package org.acumen.training.codes.itemb;

/*
Description: Test instances of SalesTax.
Author: Michael Dave Sumang
Date: September 21, 2024
*/
public class TestSalesTax {
	public static void main(String[] args) {
		SalesTax saleOne = new SalesTax();
		SalesTax saleTwo = new SalesTax();
		SalesTax saleThree = new SalesTax();
		
		saleOne.computeCost(45.0);
		saleTwo.computeCost(0);
		saleThree.computeCost(-2.0);
		
		printSalesTax(saleOne);
		printSalesTax(saleTwo);
		printSalesTax(saleThree);
	}
	
	/*
	input: SalesTax sale
	output: void
	description: prints itemCost, stateSaleTaxDue, countySaleTaxDue, 
				 and totalAmountDue 
	*/
		
	public static void printSalesTax(SalesTax sale) {
		System.out.println();
		System.out.println("Cost of item: "+sale.itemCost);
		System.out.println("amount of state sales tax due.: "
		+sale.stateSaleTaxDue); 
		System.out.println("The amount of county sales tax due: "
		+sale.countySaleTaxDue); 
		System.out.println("Total amount due: "+sale.totalAmountDue);
	}
}
