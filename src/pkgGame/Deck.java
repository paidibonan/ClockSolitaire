package pkgGame;
import pkgCards.eRank;
import pkgCards.eSuit;

public class Deck {
	
	
	private Card[] deck;
	
	private void createDeck() {
		eSuit[] suits = pkgCards.eSuit.values();
		eRank[] ranks = pkgCards.eRank.values();
		int spot = 0;
		
		for(int r = 0; r < 12; r++) {
			for (int s = 0; s < 4; s++) {
				Card c = new Card(ranks[r], suits[s]);
				deck[spot] = c;
				spot++;
			}
		}
	}
}
