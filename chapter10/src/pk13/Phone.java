package pk13;

public abstract class Phone {
	
	public String owner;
	
	//디폴트 생성자가 선언만 되있고 구현되지 않음 -> 추상 생성자
	
	//오버로딩
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}

}
