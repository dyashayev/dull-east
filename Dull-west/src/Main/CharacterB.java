package Main;

public class CharacterB implements Dueler{

	private int hp;
	
	public CharacterB() {
	}
	
	public String getName(){
		return "Star PLatinum";
	}
	
	public void taunt() {
		System.out.println("Omae Wa Mou Shindeiru!");
	}
	
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP() == hp) {
			return true;
		}
		return false;
	}
	
	public int getAction(Object caller) {
		
	}

	public void hit(Object caller) {
		
	}

}
