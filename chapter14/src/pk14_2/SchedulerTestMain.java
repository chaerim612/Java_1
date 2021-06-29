package pk14_2;

import java.io.IOException;
import java.util.Scanner;

public class SchedulerTestMain {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 할당 방식을 선택하세요 : ");
			//System.in.read(); //: 콘솔에 입력받기 모든 입력값을 아스키코드값
			//int ch=System.in.read(); //아스키코드값
			
			String mun = scan.nextLine();
			int ch = mun.charAt(0); //charAt(0):String -> ACSII
			Scheduler scheduler = null;
             
			//객체를 생성
			if (ch == 'R' || ch == 'r') {
				scheduler = new RoundRobin();
			} else if (ch == 'L' || ch == 'l') {
				scheduler = new LeastJob();
			} else if (ch == 'P' || ch == 'p') {
				scheduler = new PriorityAllocation();
			} else if (ch == 'S' || ch == 's') {
				break;
			} else {
				System.out.println("지원되지 않는 기능입니다.");
				continue; //무시
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
		
		
        /* 방법2
		Scanner s = new Scanner(System.in);
		String str;
		char a;
		boolean flag = true;	
		Scheduler rb = new RoundRobin();
		Scheduler lj = new LeastJob();
		Scheduler pa = new PriorityAllocation();

		while(flag) {
			System.out.println("==============================================");
	
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill값이 높은 상담원 높은 상담원에게 할당");
			System.out.println("S or s : 한명씩 차례로 할당");
			System.out.println("==============================================");
			
			System.out.print("전화 상담 할당 방식을 선택하세요 : ");
			str = s.next();
			a = str.charAt(0);
			
			switch(a) {
				case 'R', 'r'  : {
					rb.getNextCall();
					rb.sendCallToAgent();
				}break;
				
				case 'L' : case 'l' : {
					lj.getNextCall();
					lj.sendCallToAgent();
				}break;
				
				case 'P' : case 'p' : {
					pa.getNextCall();
					pa.sendCallToAgent();
				}break;
				
				case 'S' : case 's' : {
					flag = false;
				}break;
			}	
			
		}
		
		System.out.println("==============================================");
		System.out.println("프로그램 종료");
		*/
		
	}
}
