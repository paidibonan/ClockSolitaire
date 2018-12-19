package pkgGame;

public class Solitaire {
	
	private int kings;
	private int fullSets;
	private int aces;
	private int twos;
	private int threes;
	private int fours;
	private int fives;
	private int sixes;
	private int sevens;
	private int eights;
	private int nines;
	private int tens;
	private int jacks;
	private int queens;
	
	public int getKings() {
		return this.kings;
	}
	
	public int getAces() {
		return this.aces;
	}
	
	public int getTwos() {
		return this.twos;
	}
	
	public int getThrees() {
		return this.threes;
	}
	
	public int getFours() {
		return this.fours;
	}
	
	public int getFives() {
		return this.fives;
	}
	
	public int getSixes() {
		return this.sixes;
	}
	
	public int getSevens() {
		return this.sevens;
	}
	
	public int getEights() {
		return this.eights;
	}
	
	public int getNines() {
		return this.nines;
	}
	
	public int getTens() {
		return this.tens;
	}
	
	public int getJacks() {
		return this.jacks;
	}
	
	public int getQueens() {
		return this.queens;
	}
	
	public int getFullSets() {
		return this.fullSets;
	}
	
	public void addTwo() {
		this.twos++;
	}
	
	public void addThree() {
		this.threes++;
	}
	
	public void addFour() {
		this.fours++;
	}
	
	public void addFives() {
		this.fives++;
	}
	
	public void addSix() {
		this.sixes++;
	}
	
	public void addSeven() {
		this.sevens++;
	}
	
	public void addEight() {
		this.eights++;
	}
	
	public void addNine() {
		this.nines++;
	}
	
	public void addTen() {
		this.tens++;
	}
	
	public void addJack() {
		this.jacks++;
	}
	
	public void addQueen() {
		this.queens++;
	}
	
	public void addKing() {
		this.kings++;
	}
	
	public boolean gameOver() {
		boolean go = false;
		if (this.kings == 4) {
			go = true;
		}
		return go;
	}
	
	public boolean gameWon() {
		boolean gw = false;
		if (this.aces == 4 && this.twos == 4 && this.threes == 4 && this.fours == 4 && this.fives == 4 && this.sixes == 4 && this.sevens == 4 && this.eights == 4 && this.nines == 4 && this.tens == 4 && this.jacks == 4 && this.queens == 4) {
			gw = true;
		}
		return gw;
	}
	
	


}
