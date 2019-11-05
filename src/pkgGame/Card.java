package pkgGame;

public class Card {
	
	private pkgCards.eRank eRank;
	private pkgCards.eSuit eSuit;
	
	public Card(pkgCards.eRank rank, pkgCards.eSuit suit) {
		this.eRank = rank;
		this.eSuit = suit;
	}
	
	public pkgCards.eRank getRank(){
		return this.eRank;
	}
	
	public pkgCards.eSuit getSuit(){
		return this.eSuit;
	}
	
	
	

}
