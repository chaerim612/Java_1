package pk23;

import java.util.Random;

public class AccountThread implements Runnable {
	Account acc;
	
	public AccountThread(Account acc) {
		this.acc=acc;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//출금은 100~300원 사이 난수 지정
			int money=(new Random().nextInt(3)+1)*100;
			acc.withdraw(money);
			
			System.out.println("잔액 : "+acc.balance);
		}
	}

}
