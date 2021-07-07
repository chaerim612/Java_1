package pk23;

public class Thread_test2 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<50;i++)
			System.out.println("2");
	}
	
}
