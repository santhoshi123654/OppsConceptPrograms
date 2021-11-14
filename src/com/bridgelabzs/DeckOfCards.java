package com.bridgelabzs;

import java.util.Random;

public class DeckOfCards {

	public static void main(String args[]) {
		String[] suitCard = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] cardsArray = new String[52];

		int start = 0, end = 12, stop = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {

				cardsArray[j] = " " +suitCard[i]  + cardRank[stop]+" ";
				stop++;
			}
			stop = 0;
			start = end + 1;
			end =end + 13;
		}

		// shuffling cards

		Random random = new Random();
		int f1, f2;
		String temp;
		for (int i = 0; i < 52; i++) {
			f1 = random.nextInt(51);
			f2 = random.nextInt(51);
			if (f1 != f2) {
				temp = cardsArray[f1];
				cardsArray[f1] = cardsArray[f2];
				cardsArray[f2] = temp;
			}
		}
		// printing the shuffled cards
		int collect = 0;
		
		for (int i = 0; i < 4; i++) {
			
			if(i==0) {
				System.out.println("Cards for First Person ");
			}
			else if(i==1) {
				System.out.println("Cards of Second Person ");
			}
				else if(i==2) {
					System.out.println("Cards of Third Person ");
				}
				else if(i==3) {
					System.out.println("Cards of Fourth Person ");
			}
			
			for (int j = 0; j < 9;j++) {
				
				System.out.println(cardsArray[collect]);
				collect++;
			}
			System.out.println("\t");
			//System.out.println("\t");
			
			//System.out.println("\t");
			//System.out.println("Cards for Third Person ");
			//System.out.println("\t");
			//System.out.println("Cards for Fourth Person ");
		}
	}
}
