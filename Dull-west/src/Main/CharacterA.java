package Main;

public class CharacterA implements Dueler {
	
	private int hp;
	
	public CharacterA() {
		
	}
	
	public String getName() {
		return "The winner";
	}
	
	public void taunt() {
		double randomNumber = Math.random() * 3;
		if(randomNumber == 0)
			System.out.println("You Best Skedaddle");
		if(randomNumber == 1)
			System.out.println("You Best Skemomal");
		if(randomNumber == 2)
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
		
	}
	public void hit(Object caller) {
		
	}
}
