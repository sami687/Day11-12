package com.bl.objectorientedprogram;

public class Stock {
	private String name;
	private int numberOfShares;
	private int sharePrice;

	public void Stock(String name, int numberOfShares, int sharePrice) {
		//super();
		this.name = name;
		this.numberOfShares = numberOfShares;
		this.sharePrice = sharePrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	@Override
	public String toString() {

		return " Stocklist [ Name=" + name + "   Shares=" + numberOfShares + "   Price=" + sharePrice +"  ]";
	}
}


