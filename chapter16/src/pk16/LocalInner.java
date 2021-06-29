package pk16;

class Outter {
	// 외부필드
	int outNum = 100;
	static int sNum = 200;

	// java.lang.Thread # run()
	// Runnable은 매개변수(int i)와 지역변수는 final처럼 사용됨. 추상클래스임.
	Runnable getRunnable(int i) {
		int num = 100;

		class MyRunnable implements Runnable {

			int localNum = 10;

			@Override
			public void run() {
				//num=200;	//Runnable이므로 상수로 바뀜
				//i=100;	//Runnable이므로 매개변수 역시 상수로 바뀜
				System.out.println("i="+i);
				System.out.println("num="+num);
				System.out.println("localNum="+localNum);
				System.out.println("outNum="+outNum+"외부 인스턴스");
				System.out.println("Outter.sNum="+Outter.sNum+"외부 static 변수");
			};

		}
		return new MyRunnable();
	}
}

public class LocalInner {
	public static void main(String[] args) {
		Outter out=new Outter();
		Runnable runner=out.getRunnable(10);
		runner.run();
	}
}
