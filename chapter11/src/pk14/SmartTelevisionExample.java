package pk14;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision st=new SmartTelevision();
		
		st.turnOn();
		st.setVolume(200);
		st.turnOff();
		System.out.println("===================");
		st.search("Internet");
	}
}
