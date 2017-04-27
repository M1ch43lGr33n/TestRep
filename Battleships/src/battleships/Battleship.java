package battleships;

public class Battleship extends BoatParentClass{

	//instance variables for battleship
	int battleshipX1;
	int battleshipX2;
	int battleshipX3;
	
	int battleshipY1;
	int battleshipY2;
	int battleshipY3;
	
	//constructor for battleship
	public Battleship(String inputHeading, int battleshipX1, int battleshipY1) {
		super(3, inputHeading);
		this.battleshipX1 = battleshipX1;

		this.battleshipY1 = battleshipY1;

	}

	//getters and setter for battleship
	public int getBattleshipX1() {
		return battleshipX1;
	}

	public void setBattleshipX1(int battleshipX1) {
		this.battleshipX1 = battleshipX1;
	}

	public int getBattleshipX2() {
		return battleshipX2;
	}

	public void setBattleshipX2(int battleshipX2) {
		this.battleshipX2 = battleshipX2;
	}

	public int getBattleshipX3() {
		return battleshipX3;
	}

	public void setBattleshipX3(int battleshipX3) {
		this.battleshipX3 = battleshipX3;
	}

	public int getBattleshipY1() {
		return battleshipY1;
	}

	public void setBattleshipY1(int battleshipY1) {
		this.battleshipY1 = battleshipY1;
	}

	public int getBattleshipY2() {
		return battleshipY2;
	}

	public void setBattleshipY2(int battleshipY2) {
		this.battleshipY2 = battleshipY2;
	}

	public int getBattleshipY3() {
		return battleshipY3;
	}

	public void setBattleshipY3(int battleshipY3) {
		this.battleshipY3 = battleshipY3;
	}
	
	//method to set all positions depending upon given position and heading
	public void setBattleshipAll(int xPos, int yPos, String heading){
		if(heading.equals("North")){
			setBattleshipX1(xPos);
			setBattleshipX2(xPos);
			setBattleshipX3(xPos);
			
			setBattleshipY1(yPos);
			setBattleshipY2(yPos - 1);
			setBattleshipY3(yPos - 2);
	
		}
		else if(heading.equals("South")){
			setBattleshipX1(xPos);
			setBattleshipX2(xPos);
			setBattleshipX3(xPos);

			setBattleshipY1(yPos);
			setBattleshipY2(yPos + 1);
			setBattleshipY3(yPos + 2);

		}
		else if(heading.equals("East")){
			setBattleshipX1(xPos);
			setBattleshipX2(xPos + 1);
			setBattleshipX3(xPos + 2);

			setBattleshipY1(yPos);
			setBattleshipY2(yPos);
			setBattleshipY3(yPos);

		}
		else if(heading.equals("West")){
			setBattleshipX1(xPos);
			setBattleshipX2(xPos - 1);
			setBattleshipX3(xPos - 2);
			
			setBattleshipY1(yPos);
			setBattleshipY2(yPos);
			setBattleshipY3(yPos);

		}
			
	}
	
	public void printOutPos(){
		System.out.println("The battleships position is:");
		System.out.println("(" + this.getBattleshipX1() + "," + this.getBattleshipY1() + "), ("  + this.getBattleshipX2() + "," + this.getBattleshipY2() + "), (" + this.getBattleshipX3() + "," + this.getBattleshipY3() + ")");
	}
}
