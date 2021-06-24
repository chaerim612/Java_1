package pk12;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff(); //이륙
		sa.fly();	//비행	
		//sa.flyMode =2;
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();	 //초음속
		//sa.flyMode =1;
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly(); //비행		
		sa.land(); //착률

	}

}
