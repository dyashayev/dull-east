package Main;

public class CharacterA implements Dueler {
	
	private int hp;
	private boolean loaded = false;
	
	public CharacterA() {
		
	}
	
	public String getName() {
		return "The winner";
	}
	
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
		if(!(caller instanceof Dueler))
			return 3;
		double danRom = Math.random();
			if(danRom > .5) {
				if(loaded) {
				
					loaded = false;
					return 1;
				}
				else 
				{
					loaded = true;
					return 0;
				}
			}
			return 2;
	}
	public void hit(Object caller) {
		this.hp = this.hp - 10;
	}
}
