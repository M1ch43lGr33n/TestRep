package battleships;

public class Destroyer extends BoatParentClass{

	//instance variables for destroyer
	int destroyerX1;
	int destroyerX2;
	int destroyerX3;
	int destroyerX4;
	
	int destroyerY1;
	int destroyerY2;
	int destroyerY3;
	int destroyerY4;
	
	//generator for destroyer
	
	public Destroyer(String inputHeading, int destroyerX1 , int destroyerY1){
		super(4, inputHeading);
		this.destroyerX1 = destroyerX1;
		this.destroyerY1 = destroyerY1;

	}

	//getters and setters for destroyer
	
	public int getDestroyerX1() {
		return destroyerX1;
	}

	public void setDestroyerX1(int destroyerX1) {
		this.destroyerX1 = destroyerX1;
	}

	public int getDestroyerX2() {
		return destroyerX2;
	}

	public void setDestroyerX2(int destroyerX2) {
		this.destroyerX2 = destroyerX2;
	}

	public int getDestroyerX3() {
		return destroyerX3;
	}

	public void setDestroyerX3(int destroyerX3) {
		this.destroyerX3 = destroyerX3;
	}

	public int getDestroyerX4() {
		return destroyerX4;
	}

	public void setDestroyerX4(int destroyerX4) {
		this.destroyerX4 = destroyerX4;
	}

	public int getDestroyerY1() {
		return destroyerY1;
	}

	public void setDestroyerY1(int destroyerY1) {
		this.destroyerY1 = destroyerY1;
	}

	public int getDestroyerY2() {
		return destroyerY2;
	}

	public void setDestroyerY2(int destroyerY2) {
		this.destroyerY2 = destroyerY2;
	}

	public int getDestroyerY3() {
		return destroyerY3;
	}

	public void setDestroyerY3(int destroyerY3) {
		this.destroyerY3 = destroyerY3;
	}

	public int getDestroyerY4() {
		return destroyerY4;
	}

	public void setDestroyerY4(int destroyerY4) {
		this.destroyerY4 = destroyerY4;
	}
	
	//method to set all positions depending upon given position and heading
	public void setDestroyerAll(int xPos, int yPos, String heading){
		if(heading.equals("North")){
			setDestroyerX1(xPos);
			setDestroyerX2(xPos);
			setDestroyerX3(xPos);
			setDestroyerX4(xPos);
			
			setDestroyerY1(yPos);
			setDestroyerY2(yPos - 1);
			setDestroyerY3(yPos - 2);
			setDestroyerY4(yPos - 3);
	
		}
		else if(heading.equals("South")){
			setDestroyerX1(xPos);
			setDestroyerX2(xPos);
			setDestroyerX3(xPos);
			setDestroyerX4(xPos);

			
			setDestroyerY1(yPos);
			setDestroyerY2(yPos + 1);
			setDestroyerY3(yPos + 2);
			setDestroyerY4(yPos + 3);

		}
		else if(heading.equals("East")){
			setDestroyerX1(xPos);
			setDestroyerX2(xPos + 1);
			setDestroyerX3(xPos + 2);
			setDestroyerX4(xPos + 3);

			
			setDestroyerY1(yPos);
			setDestroyerY2(yPos);
			setDestroyerY3(yPos);
			setDestroyerY4(yPos);

		}
		else if(heading.equals("West")){
			setDestroyerX1(xPos);
			setDestroyerX2(xPos - 1);
			setDestroyerX3(xPos - 2);
			setDestroyerX4(xPos - 3);

			
			setDestroyerY1(yPos);
			setDestroyerY2(yPos);
			setDestroyerY3(yPos);
			setDestroyerY4(yPos);

		}
			
	}
	
	public void printOutPos(){
		System.out.println("The destroyer position is:");
		System.out.println("(" + this.getDestroyerX1() + "," + this.getDestroyerY1() + "), ("  + this.getDestroyerX2() + "," + this.getDestroyerY2() + "), (" + this.getDestroyerX3() + "," + this.getDestroyerY3() + "), (" + this.getDestroyerX4() + "," + this.getDestroyerY4() + ")");
}
}
