package battleships;

import java.util.ArrayList;

public class SeaGrid {
	
	
		ArrayList <Integer> xPos = new ArrayList<>();
		ArrayList <Integer> yPos = new ArrayList<>();
	
	public void emptyGrid(){

		for(int i = 1; i <= 12; i++){
			xPos.add(0);
			yPos.add(0);
		}
	}
	
	public void setX(int x){
		xPos.remove(x);
		xPos.add(x, 1);
	}
	public int returnX(){
		return xPos.get(1);
	}
	
	public void setY(int y){
		xPos.remove(y);
		xPos.add(y, 1);
	}
	
	public void returnGrid(){
		for(int i =1; i < 12; i++){
			for(int j = 1; j <12; j++){
				System.out.print("(" + xPos.get(i) + "," + yPos.get(j) + ")");
			}
			System.out.println("");
		}
	}
	
	public int CheckHit(int x, int y){
		int a = xPos.get(x);
		int b = yPos.get(y);
		return a+b;
	}

}
