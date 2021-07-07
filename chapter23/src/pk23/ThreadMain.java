package pk23;

public class ThreadMain {
	public static void main(String[] args) {
		//has a
		ThreadEx t=new ThreadEx();
		t.start();//run() 메서드를 호출
		//t.run(); -> 호출 시 독립적으로 실행 불가
		//run()을 독립적인 Thread로 실행하고 싶다면 t.start()로 호출해야함
		System.out.println("main입니다. ");
	}
}
