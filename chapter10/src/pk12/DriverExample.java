package pk12;

import test.Vehicle;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver=new Driver();
		//방법1
		driver.driver(new Bus());
		//방법2
		Taxi taxi=new Taxi();
		driver.driver(taxi);

	}

}
