package pk23;

public class ThreadJoin implements Runnable{
	public static void main(String[] args) {
		System.out.println("메인클래스 시작");
		
		ThreadJoin t1=new ThreadJoin();	
		Thread mThread=new Thread(t1); //일반 클래스의 객체를 스레드
		mThread.start();	//run()
		
		try {
			//run() 완전히 작업을 마칠 떄까지 메인이 기다려줌
			mThread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
