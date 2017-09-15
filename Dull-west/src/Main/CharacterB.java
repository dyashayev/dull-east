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
	
	public void getHP(int hp) {
		this.hp = hp;
	}
	
	boolean determineIfOpponentIsFair(Dueler d, int hp) {
		
	}
	
	int getAction(Object caller);

	void hit(Object caller);

}
