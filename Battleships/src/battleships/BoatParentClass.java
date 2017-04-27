package battleships;

public class BoatParentClass {
	
	int boatLength;
	String heading;
	

	public BoatParentClass(int inputBoatLength, String inputHeading) {
		this.boatLength = inputBoatLength;
		this.heading = inputHeading;
	}


	public void setBoatLength(int inputBoatLength){
		this.boatLength = inputBoatLength;
	}	
	
	public void setHeading(String inputHeading){
		this.heading = inputHeading;
	}
		
	public int getBoatLength(){
		return this.boatLength;
	}
	public String getHeading(){
		return this.heading;
	}
}
