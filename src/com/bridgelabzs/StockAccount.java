package com.bridgelabzs;

public class StockAccount {
	
	public static void main(String[] args) throws Exception {
		StockPortfolio portfolio = new StockPortfolio();
		portfolio.readFileInput();
		portfolio.writeDataIntoFile();
	}
}
