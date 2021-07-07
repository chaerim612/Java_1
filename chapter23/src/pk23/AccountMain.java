package pk23;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Account acc=new Account();
		Runnable r=new AccountThread(acc);
		
		Thread t1=new Thread(r);
		
		t1.start();
		
		while(true) {
			System.out.print("입금할 금액: ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			acc.deposit(n);
			
		}
	}
}
