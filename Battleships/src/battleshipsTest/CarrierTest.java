package battleshipsTest;

import static org.junit.Assert.*;

import org.junit.Test;

import battleships.Carrier;

public class CarrierTest {

	@Test
	public void test() {
		Carrier Carrier1 = new Carrier("north", 5, 5);
		Carrier1.setHeading("north");
		int x1 = Carrier1.getCarrierX1();
		int x2 = Carrier1.getCarrierX2();
		int x3 = Carrier1.getCarrierX3();
		int x4 = Carrier1.getCarrierX4();
		int x5 = Carrier1.getCarrierX5();
		
		int y1 = Carrier1.getCarrierY1();
		int y2 = Carrier1.getCarrierY2();
		int y3 = Carrier1.getCarrierY3();
		int y4 = Carrier1.getCarrierY4();
		int y5 = Carrier1.getCarrierY5();
		
		if(x1 != 5 && x2 != 5 && x5 != 5 && y1 != 5 && y2 != 4 && y5!= 0)
		fail("Not yet implemented");
	}

}
