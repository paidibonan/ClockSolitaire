package pkgCards;

public enum eSuit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	
	private String suit;
	
	public eSuit[] getSuits() {
		return eSuit.values();
	}
	
	public String getSuitValue() {
		return this.suit;
	}

}
