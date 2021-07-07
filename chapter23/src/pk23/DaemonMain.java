package pk23;

public class DaemonMain implements Runnable {

	static boolean autoSave = false;

	public static void main(String[] args) {
		// 데몬 스레드는 일반스레드를 돕는 보조적인 역할을 한다.
		// 함께 구동 중이던 일반 스레드가 종료되면 데몬도 자동 종료된다.

		// 문서 작성 도중 3초 간격으로 자동 세이브가 필요하다고 가정하고 구현
		DaemonMain dm = new DaemonMain();
		Thread t = new Thread(dm);

		// t객체는 스레드가 데몬스레드임을 명시
		t.setDaemon(true);

		// run() 실행
		t.start();

		for (int i = 1; i <= 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();

			}
			System.out.println(i);
			if (i == 3)
				autoSave = true;

		}

	}

	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (autoSave == true)
				System.out.println("자동 저장을 수행합니다. ");
		}

	}
}
