package pk10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
		//방법1
		/*
		Bank bk1=new Bank("강남", "010-111-2222");
		//bk1.interest=0.2f;
		Bank.interest=0.2f;
		bk1.getBank();
		
		System.out.println("-----------------------");
		
		Bank bk2=new Bank("일산동구", "010-2222-3333");
		bk2.getBank();
		*/
		//방법2
		String point=null;
		String tell=null;
		Scanner scan = new Scanner(System.in);
		
		point = JOptionPane.showInputDialog("지점명 : ");
		tell = JOptionPane.showInputDialog("전화번호 : ");
		Bank bank = new Bank(point, tell);
		
		System.out.print(point + " 지점의 이자를 입력하세요 > ");
		Bank.interest=scan.nextFloat();
		
		bank.getBank();
		

	}

}
