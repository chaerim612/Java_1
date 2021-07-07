package pk23;

public class Thread_Ex extends Thread{
	private int[] temp;
	
	public Thread_Ex() {
		temp=new int[10];
		for(int i=0;i<temp.length;i++) {
			temp[i]=i;
		}
	}

	@Override
	public void run() {//스레드 클래스에서는 반드시 run() 호출이 있어야 함
		for(int i:temp) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("temp : "+temp[i]);
		}
	}
	
}
