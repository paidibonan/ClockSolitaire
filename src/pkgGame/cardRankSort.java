package pkgGame;

import java.util.Comparator;

public class cardRankSort implements Comparator {
	

	/**
	 * New comparator that returns an int value based on the relation of the first object
	 * to the second. It looks at the ranks of the cards and determines which
	 * one is larger, and orders them accordingly
	 * 
	 * 
	 * @return int represents the relation between the two given objects
	 */
	@Override
	public int compare(Object o1, Object o2) {
		int rank = 0;
		if (o1 instanceof Card && o2 instanceof Card) {
			Card c1 = (Card) o1;
			Card c2 = (Card) o2;
			rank = c1.getRank().getRankValue() - c2.getRank().getRankValue();
		}
		return rank;
		
	}

}
