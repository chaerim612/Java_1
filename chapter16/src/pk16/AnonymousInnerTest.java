package pk16;

class Outter2 {
	Runnable getRunnable(int i) {
		int num = 100; // final

		// 클래스명이 생략
		return new Runnable() {

			@Override
			public void run() {
				// num=200; =>ERROR
				// i=500; =>ERROR
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	//익명의 클래스
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable이 재구현됨");
		}
	};
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outter2 out2=new Outter2();
		
		//방법1
		Runnable runnable=out2.getRunnable(5);
		runnable.run();
		//방법2 
		out2.runner.run();
	}
}
