package pk23;

public class Thread_Ex_Main {
	public static void main(String[] args) {
		Thread_test1 t1=new Thread_test1();
		Thread_test2 t2=new Thread_test2();
		
		t1.start();
		t2.start();
		
		
	}
}
