package pkgCards;

public enum eRank {
	
	ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);
	
	private int value;
	
	eRank(int v) {
		this.value = v;
	}
		
	public eRank[] getRanks() {
		return eRank.values(); 
	}
	
	public int getRankValue() {
		return this.value;
	}
	


}
