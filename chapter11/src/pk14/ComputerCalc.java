package pk14;

public class ComputerCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2!=0)
			return num1/num2;
		else
			return Calc.ERROR;	//static 클래스형 변수이므로 클래스명으로 명시
	}
	
	//구현 메서드
	public void showInfo() {
		System.out.println("Calc 인터페이스 구현부");
	}

	//오버라이딩 필수 아님
	@Override
	public void description() {
		// TODO Auto-generated method stub
		super.description();
	}
	

}
