package Main;

public class CharacterB implements Dueler{

	private int hp;
	private boolean loaded = false;
	
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
		if(!(caller instanceof Dueler)) {
			return 3;
		}
		double randomAct = Math.random();
			if(randomAct > .5) {
				if(loaded) {
					loaded = false;
					return 1;
				}
				else{
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
