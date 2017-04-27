package battleships;

public class Carrier extends BoatParentClass{

	//Boat object for carrier
	
	int carrierX1;
	int carrierX2;
	int carrierX3;
	int carrierX4;
	int carrierX5;

	int carrierY1;
	int carrierY2;
	int carrierY3;
	int carrierY4;
	int carrierY5;
	
	//generator for a carrier
	
	public Carrier(String inputHeading, int carrierX1, int carrierY1) {
		super(5, inputHeading);
		this.carrierX1 = carrierX1;
		this.carrierY1 = carrierY1;

	}

	//getters and setters for carrier
	
	public int getCarrierX1() {
		return carrierX1;
	}

	public void setCarrierX1(int carrierX1) {
		this.carrierX1 = carrierX1;
	}

	public int getCarrierX2() {
		return carrierX2;
	}

	public void setCarrierX2(int carrierX2) {
		this.carrierX2 = carrierX2;
	}

	public int getCarrierX3() {
		return carrierX3;
	}

	public void setCarrierX3(int carrierX3) {
		this.carrierX3 = carrierX3;
	}

	public int getCarrierX4() {
		return carrierX4;
	}

	public void setCarrierX4(int carrierX4) {
		this.carrierX4 = carrierX4;
	}

	public int getCarrierX5() {
		return carrierX5;
	}

	public void setCarrierX5(int carrierX5) {
		this.carrierX5 = carrierX5;
	}

	public int getCarrierY1() {
		return carrierY1;
	}

	public void setCarrierY1(int carrierY1) {
		this.carrierY1 = carrierY1;
	}

	public int getCarrierY2() {
		return carrierY2;
	}

	public void setCarrierY2(int carrierY2) {
		this.carrierY2 = carrierY2;
	}

	public int getCarrierY3() {
		return carrierY3;
	}

	public void setCarrierY3(int carrierY3) {
		this.carrierY3 = carrierY3;
	}

	public int getCarrierY4() {
		return carrierY4;
	}

	public void setCarrierY4(int carrierY4) {
		this.carrierY4 = carrierY4;
	}

	public int getCarrierY5() {
		return carrierY5;
	}

	public void setCarrierY5(int carrierY5) {
		this.carrierY5 = carrierY5;
	}
	
	//method to set all positions depending upon given position and heading
	public void setCarrierAll(int xPos, int yPos, String heading){
		if(heading.equals("North")){
			setCarrierX1(xPos);
			setCarrierX2(xPos);
			setCarrierX3(xPos);
			setCarrierX4(xPos);
			setCarrierX5(xPos);
			
			setCarrierY1(yPos);
			setCarrierY2(yPos - 1);
			setCarrierY3(yPos - 2);
			setCarrierY4(yPos - 3);
			setCarrierY5(yPos - 4);	
		}
		else if(heading.equals("South")){
			setCarrierX1(xPos);
			setCarrierX2(xPos);
			setCarrierX3(xPos);
			setCarrierX4(xPos);
			setCarrierX5(xPos);
			
			setCarrierY1(yPos);
			setCarrierY2(yPos + 1);
			setCarrierY3(yPos + 2);
			setCarrierY4(yPos + 3);
			setCarrierY5(yPos + 4);	
		}
		else if(heading.equals("East")){
			setCarrierX1(xPos);
			setCarrierX2(xPos + 1);
			setCarrierX3(xPos + 2);
			setCarrierX4(xPos + 3);
			setCarrierX5(xPos + 4);
			
			setCarrierY1(yPos);
			setCarrierY2(yPos);
			setCarrierY3(yPos);
			setCarrierY4(yPos);
			setCarrierY5(yPos);	
		}
		else if(heading.equals("West")){
			setCarrierX1(xPos);
			setCarrierX2(xPos - 1);
			setCarrierX3(xPos - 2);
			setCarrierX4(xPos - 3);
			setCarrierX5(xPos - 4);
			
			setCarrierY1(yPos);
			setCarrierY2(yPos);
			setCarrierY3(yPos);
			setCarrierY4(yPos);
			setCarrierY5(yPos);	
		}
			
	}

	public void printOutPos(){
		System.out.println("The carriers position is:");
		System.out.println("(" + this.getCarrierX1() + "," + this.getCarrierY1() + "), ("  + this.getCarrierX2() + "," + this.getCarrierY2() + "), (" + this.getCarrierX3() + "," + this.getCarrierY3() + "), (" + this.getCarrierX4() + "," + this.getCarrierY4() + "), (" + this.getCarrierX5() + "," + this.getCarrierY5() + ")");
	}
}
