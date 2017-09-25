package Main;

public class CharacterA implements Dueler {
	
	private int hp;
	
	public CharacterA() {
		
	}
	
	public String getName() {
		return "The winner";
	}
	//test

	public void taunt() {
		double randomNumber = Math.random();
		if(randomNumber > .66)
			System.out.println("You Best Skedaddle");
		if(randomNumber < .33)
			System.out.println("You Best Skemomal");
		if(randomNumber >= .33 && randomNumber <= .66)
			System.out.println("Is that a Jojo reference?!");
	}
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	public int getHP() {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		return d.getHP() == hp;
	}
	public int getAction(Object caller) {
		double danRom = Math.random();
			if(danRom > .5) {
				if(danRom <= 1 && danRom > .5)
					return 1;
				else {
					return 0;
				}
			}
			else {
				if(danRom <= .5 && danRom > .25)
					return 2;
				else {
					return 3;
				}
			}
	}
	public void hit(Object caller) {
		this.hp = this.hp - 10;
	}
}
