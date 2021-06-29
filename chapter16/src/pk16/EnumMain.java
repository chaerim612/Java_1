package pk16;

import java.util.Scanner;

public class EnumMain {
	
	//enum
	public enum Item{//클래스로 만든 배열
		Start, Pause, Exit, 
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("0: 게임시작");
			System.out.println("1: 일시정지");
			System.out.println("2: 게임종료");
			
			Scanner sc=new Scanner(System.in);
			System.out.print("입력: ");
			int n=sc.nextInt();
			
			Item start=Item.Start;
			Item pause=Item.Pause;
			Item exit=Item.Exit;
			
			//System.out.println(start.ordinal());
			
			if(n==start.ordinal())
				System.out.println("게임 시작됨");
			else if(n==pause.ordinal())
				System.out.println("게임이 일시 중지됨");
			else {
				System.out.println("게임이 종료됨");
				return;
			}
		}
	}
}
