package pk23;

import java.util.Scanner;

/*스캐너를 이용하여 키보드에서 숫자를 입력받고
스레드에서 입력받은 숫자가 1씩 감소하다가 0이 되었을 때
“종료”라는 메시지와 함께 스레드를 빠져나오도록*/

public class ThreadCount implements Runnable{
	private int n;
	public ThreadCount(int n) {
		this.n=n;
	}
	public static void main(String[] args) {
		System.out.print("수행 횟수 입력 : ");
		Scanner sc=new Scanner(System.in);
		
		ThreadCount t=new ThreadCount(sc.nextInt());
		Thread t1=new Thread(t);
		t1.start();
		
	}
	@Override
	public void run() {
		for(int i=n;i>=0;i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("종료");
		
	}
	
}
