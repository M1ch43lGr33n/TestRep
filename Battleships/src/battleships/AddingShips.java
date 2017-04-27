package battleships;


import java.io.IOException;
import java.util.Scanner;

import org.junit.internal.Throwables;

public class AddingShips {
	
	public static void startingSetUp(){
		SeaGrid playerGrid = new SeaGrid();
		playerGrid.emptyGrid();
		Carrier carrierObj = addCarrier();
		carrierObj.printOutPos();
		
		
		playerGrid.setX(carrierObj.getCarrierX1());
		playerGrid.setY(carrierObj.getCarrierY1());
		playerGrid.returnGrid();
		System.out.println("--------");
		/*
		Destroyer DestroyerObj = addDestroyer();
		DestroyerObj.printOutPos();
		System.out.println("--------");
		Battleship battleshipObj = addBattleship();
		battleshipObj.printOutPos();
		System.out.println("--------");
		PatrolBoat patrolBoatObj = addPatrolBoat();
		patrolBoatObj.printOutPos();
*/
	}
	
	public static Carrier addCarrier() throws IndexOutOfBoundsException{
		boolean incorrectInfo = true;
		Carrier Carrier1 =new Carrier("North", 5, 5);
		while (incorrectInfo) {
			try{
				Scanner userInput = new Scanner(System.in); 
				//code to get carrier heading, position.
				System.out.print("Please enter a heading for the Carrier.");
				System.out.println(" ");
				String shipHeading = userInput.next(); 
				System.out.print("Please enter a X position for the Carrier between 1 and 12.");
				System.out.println(" ");
				int shipXPos = userInput.nextInt();
				System.out.print("Please enter a Y position for the Carrier between 1 and 12.");
				System.out.println(" ");
				int shipYPos = userInput.nextInt();
				
				//Checking if carrier is in grid 
				if(shipXPos > 12 || shipYPos >12 || shipXPos < 0 || shipYPos < 0){
					System.out.println("Please enter a correct place so that the boat is on the 12 X 12 grid.");
					continue;
				}
				
				if(shipHeading.equals("North") && shipYPos > 4){
					Carrier1.setCarrierAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return Carrier1;
					}
				
				else if(shipHeading.equals("South") && shipYPos < 9){
					Carrier1.setCarrierAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return Carrier1;
					}
				
				if(shipHeading.equals("West") && shipXPos > 4){
					Carrier1.setCarrierAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return Carrier1;
					}
				
				if(shipHeading.equals("East") && shipXPos < 9){
					Carrier1.setCarrierAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return Carrier1;
					}
				else if(incorrectInfo == false){
					break;
				}
				
				else{
					System.out.println("Please enter a correct heading and place so that the boat is on the 12 X 12 grid");
					}
				}	
			catch (Exception ex) {
				System.out.println("Incorrect input, try again. " + ex.toString());
			}
		}
		return Carrier1;
	}
	
	public static Destroyer addDestroyer() throws IndexOutOfBoundsException{
		boolean incorrectInfo = true;
		Destroyer Destroyer1 = new Destroyer("North", 5, 5);
		while (incorrectInfo) {
			try{
				Scanner userInput = new Scanner(System.in); 
				//code to get Destroyer heading, position.
				System.out.print("Please enter a heading for the destroyer.");
				System.out.println(" ");
				String shipHeading = userInput.next(); 
				System.out.print("Please enter a X position for the destroyer between 1 and 12.");
				System.out.println(" ");
				int shipXPos = userInput.nextInt();
				System.out.print("Please enter a Y position for the destroyer between 1 and 12.");
				System.out.println(" ");
				int shipYPos = userInput.nextInt();
				
				//Checking if Destroyer is in grid 
				if(shipXPos > 12 || shipYPos >12 || shipXPos < 0 || shipYPos < 0){
					System.out.println("Please enter a correct place so that the boat is on the 12 X 12 grid.");
					continue;
				}
				
				if(shipHeading.equals("North") && shipYPos > 3){
					Destroyer1.setDestroyerAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return Destroyer1;
					}
				
				else if(shipHeading.equals("South") && shipYPos < 10){
					Destroyer1.setDestroyerAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return Destroyer1;
					}
				
				if(shipHeading.equals("West") && shipXPos > 3){
					Destroyer1.setDestroyerAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return Destroyer1;
					}
				
				if(shipHeading.equals("East") && shipXPos < 10){
					Destroyer1.setDestroyerAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return Destroyer1;
					}
				else if(incorrectInfo == false){
					break;
				}
				
				else{
					System.out.println("Please enter a correct heading and place so that the boat is on the 12 X 12 grid");
					}
				}	
			catch (Exception ex) {
				System.out.println("Incorrect input, try again. " + ex.toString());
			}
		}
		return Destroyer1;
	}
	
	public static Battleship addBattleship() throws IndexOutOfBoundsException{
		boolean incorrectInfo = true;
		Battleship battleShip1 = new Battleship("North", 5, 5);
		while (incorrectInfo) {
			try{
				Scanner userInput = new Scanner(System.in); 
				//code to get battleship heading, position.
				System.out.print("Please enter a heading for the battleship.");
				System.out.println(" ");
				String shipHeading = userInput.next(); 
				System.out.print("Please enter a X position for the battleship between 1 and 12.");
				System.out.println(" ");
				int shipXPos = userInput.nextInt();
				System.out.print("Please enter a Y position for the battleship between 1 and 12.");
				System.out.println(" ");
				int shipYPos = userInput.nextInt();
				
				//Checking if battleship is in grid 
				if(shipXPos > 12 || shipYPos >12 || shipXPos < 0 || shipYPos < 0){
					System.out.println("Please enter a correct place so that the boat is on the 12 X 12 grid.");
					continue;
				}
				
				if(shipHeading.equals("North") && shipYPos > 2){
					battleShip1.setBattleshipAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return battleShip1;
					}
				
				else if(shipHeading.equals("South") && shipYPos < 11){
					battleShip1.setBattleshipAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return battleShip1;
					}
				
				if(shipHeading.equals("West") && shipXPos > 2){
					battleShip1.setBattleshipAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return battleShip1;
					}
				
				if(shipHeading.equals("East") && shipXPos < 11){
					battleShip1.setBattleshipAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return battleShip1;
					}
				else if(incorrectInfo == false){
					break;
				}
				
				else{
					System.out.println("Please enter a correct heading and place so that the boat is on the 12 X 12 grid");
					}
				}	
			catch (Exception ex) {
				System.out.println("Incorrect input, try again. " + ex.toString());
			}
		}
		return battleShip1;
	}
	
	public static PatrolBoat addPatrolBoat() throws IndexOutOfBoundsException{
		boolean incorrectInfo = true;
		PatrolBoat patrolBoat1 = new PatrolBoat("North", 5, 5);
		while (incorrectInfo) {
			try{
				Scanner userInput = new Scanner(System.in); 
				//code to get PatrolBoat heading, position.
				System.out.print("Please enter a heading for the PatrolBoat.");
				System.out.println(" ");
				String shipHeading = userInput.next(); 
				System.out.print("Please enter a X position for the PatrolBoat between 1 and 12.");
				System.out.println(" ");
				int shipXPos = userInput.nextInt();
				System.out.print("Please enter a Y position for the PatrolBoat between 1 and 12.");
				System.out.println(" ");
				int shipYPos = userInput.nextInt();
				
				//Checking if PatrolBoat is in grid 
				if(shipXPos > 12 || shipYPos >12 || shipXPos < 0 || shipYPos < 0){
					System.out.println("Please enter a correct place so that the boat is on the 12 X 12 grid.");
					continue;
				}
				
				if(shipHeading.equals("North") && shipYPos > 1){
					patrolBoat1.setPatrolBoatAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return patrolBoat1;
					}
				
				else if(shipHeading.equals("South") && shipYPos < 12){
					patrolBoat1.setPatrolBoatAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return patrolBoat1;
					}
				
				if(shipHeading.equals("West") && shipXPos > 1){
					patrolBoat1.setPatrolBoatAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return patrolBoat1;
					}
				
				if(shipHeading.equals("East") && shipXPos < 12){
					patrolBoat1.setPatrolBoatAll(shipXPos, shipYPos, shipHeading);
					incorrectInfo = false;
					return patrolBoat1;
					}
				else if(incorrectInfo == false){
					break;
				}
				
				else{
					System.out.println("Please enter a correct heading and place so that the boat is on the 12 X 12 grid");
					}
				}	
			catch (Exception ex) {
				System.out.println("Incorrect input, try again. " + ex.toString());
			}
		}
		return patrolBoat1;
	}
}
