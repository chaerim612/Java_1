package pk23;

public class Account {
	int balance = 1000;

	// 출금 메서드 / synchronized : 자원을 공유하지 않음(작업하는 동안 동시 접속 불가능)
	public synchronized void withdraw(int money) {

		// 잔액이 출금보다 적을 경우
		if (balance < money) {
			try {
				wait(); // 일시 정지 스레드
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		balance -= money;
	}

	// 입금 메서드
	public synchronized void deposit(int money) {
		balance += money;
		notify(); // 정지된 스레드
	}
}
