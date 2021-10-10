package com.bl.objectorientedprogram;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {

	private static final int INVENTORY_SIZE = 3;
	private Stock [] stocks;
	ArrayList<String> stocklist = new ArrayList<>();

	public StockAccount() {
		stocks = new Stock [INVENTORY_SIZE];
	}

	private void StockAccount() {
		Stock S = new Stock();
		for (int i = 0; i<INVENTORY_SIZE; i++){
			Scanner console = new Scanner(System.in);

			System.out.println ("Stock's name:");
			S.setName(console.next());

			System.out.println ("Stock's price:");
			S.setNumberOfShares(console.nextInt());

			System.out.println ("Numbers of shares: ");

			S.setSharePrice(console.nextInt());

			stocklist.add(S.toString());   
		}
		System.out.println(stocklist); 
	}

	public static void main (String [] args){
		StockAccount S1 = new StockAccount();

		S1.StockAccount();
	}
}
