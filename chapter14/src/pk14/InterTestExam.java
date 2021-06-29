package pk14;

public class InterTestExam implements InterTest{

	@Override
	public int getA() {
		//A=200; //ERROR : final변수이므로 변경 안됨
		return A;//Intertest의 상수값
	}

}
