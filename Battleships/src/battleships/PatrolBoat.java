package battleships;

public class PatrolBoat extends BoatParentClass{

	//instance variables for patrol boat
	int patrolBoatX1;
	int patrolBoatX2;
	
	int patrolBoatY1;
	int patrolBoatY2;
	
	//constructor for patrol boat
	public PatrolBoat(String inputHeading, int patrolBoatX1,int patrolBoatY1) {
		super(2, inputHeading);
		this.patrolBoatX1 = patrolBoatX1;

		this.patrolBoatY1 = patrolBoatY1;

	}

	//getters and setters for patrol boat
	public int getPatrolBoatX1() {
		return patrolBoatX1;
	}

	public void setPatrolBoatX1(int patrolBoatX1) {
		this.patrolBoatX1 = patrolBoatX1;
	}

	public int getPatrolBoatX2() {
		return patrolBoatX2;
	}

	public void setPatrolBoatX2(int patrolBoatX2) {
		this.patrolBoatX2 = patrolBoatX2;
	}

	public int getPatrolBoatY1() {
		return patrolBoatY1;
	}

	public void setPatrolBoatY1(int patrolBoatY1) {
		this.patrolBoatY1 = patrolBoatY1;
	}

	public int getPatrolBoatY2() {
		return patrolBoatY2;
	}

	public void setPatrolBoatY2(int patrolBoatY2) {
		this.patrolBoatY2 = patrolBoatY2;
	}
	
	//method to set all positions depending upon given position and heading
	public void setPatrolBoatAll(int xPos, int yPos, String heading){
		if(xPos < 1 && heading == "west" || xPos > 11 && heading == "east" || yPos <1 && heading == "north" || yPos > 11 && heading == "south"){
			System.out.println("Can't place a patrol boat in that position with that heading");
		}		
		else if(heading.equals("North")){
			setPatrolBoatX1(xPos);
			setPatrolBoatX2(xPos);
			
			setPatrolBoatY1(yPos);
			setPatrolBoatY2(yPos - 1);
	
		}
		else if(heading.equals("South")){
			setPatrolBoatX1(xPos);
			setPatrolBoatX2(xPos);

			setPatrolBoatY1(yPos);
			setPatrolBoatY2(yPos + 1);

		}
		else if(heading.equals("East")){
			setPatrolBoatX1(xPos);
			setPatrolBoatX2(xPos + 1);

			setPatrolBoatY1(yPos);
			setPatrolBoatY2(yPos);

		}
		else if(heading.equals("West")){
			setPatrolBoatX1(xPos);
			setPatrolBoatX2(xPos - 1);
					
			setPatrolBoatY1(yPos);
			setPatrolBoatY2(yPos);

		}
			
	}
	public void printOutPos(){
		System.out.println("The patrol boat position is:");
		System.out.println("(" + this.getPatrolBoatX1() + "," + this.getPatrolBoatY1() + "), ("  + this.getPatrolBoatX2() + "," + this.getPatrolBoatY2() + ")");
	}
}
