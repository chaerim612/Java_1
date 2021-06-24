package pk12;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		
		System.out.println("Computer객체의 areaCircle() 실행됨");
		System.out.println(Math.PI);
		
		return Math.PI*r*r;
	}
	
	

}
