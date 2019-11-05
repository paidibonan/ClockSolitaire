package pkgTest;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import pkgCards.eRank;
import pkgCards.eSuit;
import pkgGame.Card;
import pkgGame.cardRankSort;

public class CardTests {
	
	@Test
	public void card_rank_sort_test() {
		Card c1 = new Card(eRank.ACE, eSuit.DIAMONDS);
		Card c2 = new Card(eRank.TWO, eSuit.HEARTS);
		Card c3 = new Card(eRank.QUEEN, eSuit.DIAMONDS);
		Card c4 = new Card(eRank.FIVE, eSuit.CLUBS);
		Card c5 = new Card(eRank.THREE, eSuit.SPADES);
		
		
		ArrayList<Card> deck = new ArrayList<Card>();
		
		deck.add(c1);
		deck.add(c2);
		deck.add(c3);
		deck.add(c4);
		deck.add(c5);
		
		Collections.shuffle(deck);
		
		Collections.sort(deck, new cardRankSort());
		
		assertTrue(deck.get(0).getRank().equals(eRank.ACE));
		assertTrue(deck.get(1).getRank().equals(eRank.TWO));
		assertTrue(deck.get(2).getRank().equals(eRank.THREE));
		assertTrue(deck.get(3).getRank().equals(eRank.FIVE));
		assertTrue(deck.get(4).getRank().equals(eRank.QUEEN));
		
	}

}
