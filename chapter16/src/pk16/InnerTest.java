package pk16;

class OutClass {
	// 외부 클래스 멤버변수
	private int num = 0;
	private static int sNum = 20;
	private InClass inClass; // 선언

	// 생성자를 통해 내부 클래스의 객체를 생성
	public OutClass() {
		inClass = new InClass(); // 내부 클래스의 객체 생성
	}

	// 내부 인스턴스 클래스
	class InClass {
		int inNum = 100;

		void inTest() {
			System.out.println("OutClass num: " + num + " (외부클래스 인스턴스 변수)");
			System.out.println("OutClass sNum: " + sNum + " (외부클래스 전역 변수)");
			System.out.println("InClass inNum: " + inNum + " (내부클래스 인스턴스 변수)");
		}
	}

	// private 멤버 변수일때 사용 권장
	public void usingClass() {
		inClass.inTest();
	}

	// 내부 정적(static) 클래스
	static class InStaticClass {
		int inNum = 100;
		static int sinNum = 200;
		// num=500; //객체가 있어야 사용 가능

		void inTest() {
			// num=500; //객체가 있어야 사용 가능
			inNum = 101;
			sinNum = 201;
			sNum = 300;

			System.out.println("InStaticClass inNum: " + inNum + " (내부 인스턴스 변수)");
			System.out.println("InStaticClass sNum: " + sinNum + " (내부 static 변수)");
			System.out.println("InStaticClass sNum: " + sNum + " (내부클래스 static 변수)");
		}

		static void sTest() {
			sinNum = 200;
			sNum = 300;
			// inNum=100; 생명주기 틀림
			System.out.println("InStaticClass sinNum: " + sinNum + " (내부 인스턴스 변수)");
			System.out.println("OutStaticClass sNum: " + sNum + " (내부클래스 static 변수)");

		}
	}

}

public class InnerTest {
	public static void main(String[] args) {
		System.out.println("<< private으로 변수 접근시 호출 >>");

		OutClass out = new OutClass();
		out.usingClass(); // 메서드를 이용해 간접 접근

		System.out.println("=======================================");
		System.out.println("<< 외부클래스 먼저 생성 후 내부클래스 호출 >>");
		OutClass out2 = new OutClass();
		OutClass.InClass inner = out2.new InClass();
		inner.inTest(); // 직접 접근
		
		System.out.println();
		
		//외부클래스 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass sInClass=new OutClass.InStaticClass();
		sInClass.sTest();
		sInClass.inTest(); 	//객체 생성 후 호출
		
		OutClass.InStaticClass.sTest(); //직접 호출
		
		

	}
}
