package Main;

public class CharacterB implements Dueler{

	private int hp;
	
	public CharacterB() {
	}
	
	public String getName(){
		return "Jotaro Kujo";
	}
	
	public void taunt() {
		double randomNumber = Math.random();
		if(randomNumber > .66)
			System.out.println("Omai Wa Mou Shindeiru");
		if(randomNumber < .66 && randomNumber > .33)
			System.out.println("Sabaku No Ore Wa Stando Da");
		if(randomNumber < .33)
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
		double randomAction = Math.random();
			if(randomAction > .66) {
				return 0;
			}
			if(randomAction < .66 && randomAction > .33) {
				return 1;
			}
			if(randomAction < .33) {
				return 2;
			}
			return 3;
	}
			
	public void hit(Object caller) {
		this.hp = this.hp - 10;
	}

}
