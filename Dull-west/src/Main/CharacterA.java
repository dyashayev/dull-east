package Main;

public class CharacterA implements Dueler {
	
	private int hp;
	
	public CharacterA() {
		
	}
	
	public String getName() {
		return "The winner";
	}
	
	public void taunt() {
		System.out.println("You Best Skedaddle");
	}
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	public int getHP() {
		return hp;
	}
}
