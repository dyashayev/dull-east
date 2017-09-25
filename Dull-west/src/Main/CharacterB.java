package Main;

public class CharacterB implements Dueler{

	private int hp;
	
	public CharacterB() {
	}
	
	public String getName(){
		return "Jotaro Kujo";
	}
	
	public void taunt() {
		double randomNumber = Math.random() * 3;
		if(randomNumber == 0)
			System.out.println("Omai Wa Mou Shindeiru");
		if(randomNumber == 1)
			System.out.println("Sabaku No Ore Wa Stando Da");
		if(randomNumber == 2)
			System.out.println("Yare Yare Daze");
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
		this.hp = this.hp - 10;
	}

}
