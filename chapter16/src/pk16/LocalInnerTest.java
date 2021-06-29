package pk16;

public class LocalInnerTest {

	int a = 100;

	public void innerTest(int n) { // 로컬 메서드
		int b = 200; // 지역변수
		final int c = n; // 상수

		class Inner {
			public void getData() {
				System.out.println("int a : " + a);
				System.out.println("final int c : " + c);
			}
		}
		//===================================================
		Inner i = new Inner();
		i.getData();
	}

	public static void main(String[] args) {
		LocalInnerTest outer = new LocalInnerTest();
		outer.innerTest(5);
		
	}
}
