package pk13;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== 자율주행 하는 자동차 ===");
		Car myCar=new ManualCar();
		myCar.run();

		System.out.println("=== 사람이 운전 하는 자동차 ===");
		Car hisCar=new ManualCar();
		hisCar.run();
	}

}
