package pk14;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		
		
	   Remote rc=new SmartTelevision();
	   rc.turnOn();
	   rc.setVolume(200);
	   rc.turnOff();
	
		System.out.println("--------------");
		SmartTelevision tv=new SmartTelevision();
		tv.search("Internet");
		
	}

}
