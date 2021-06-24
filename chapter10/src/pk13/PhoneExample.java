package pk13;

public class PhoneExample {


	public static void main(String[] args) {
		//추상클래스는 heap메모리를 사용할 수 없다.
		//Phone phone=new Phone(); (X)
		//Phone phone=new Phone("홍길동"); (X)
		
		SmartPhone smartphone=new SmartPhone("홍길동");
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		
	}

}
