package pk23;

public class Thread_Main implements Runnable{
	
	public static void main(String[] args) {
		System.out.println("메인클래스 시작");
		Thread_Main t1=new Thread_Main();
		
		Thread mThread=new Thread(t1);
		mThread.start();
		
		System.out.println("메인클래스 종료");
	}
	
	//메인 클래스가 실행된 후에 스레드의 객체를 호출하고 start()를 사용하여 run()이 호출됨
	
	@Override
	public void run() {
		System.out.println("run()");
		first();
		
	}
	
	public void first() {
		System.out.println("first()");
		second();
	}

	public void second() {
		System.out.println("second()");
	}

}
