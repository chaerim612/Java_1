package pk14_2;

import java.util.Scanner;

public class SchedulerTest {

	// Scheduler클래스를 기준으르 하여 RoundRobin, LeasJob, PriorityAllocation

	public static void main(String[] args) {
		Scheduler S1 = new RoundRobin();
		Scheduler S2 = new LeasJob();
		Scheduler S3 = new PriorityAllocation();
		Scanner sc=new Scanner(System.in);
		
		/* 방법1,2
		while(true) {
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 적은 상담원에게 할당");
			System.out.println("P or p : 업무 스킬값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			
			//System.in.read(); //: 콘솔에 입력받기 모든 입력값을 아스키코드값
			//int ch=System.in.read(); //아스키코드값
			
			//String mun=sc.next();
			//int ch=mun.charAt(0);
			Scheduler scheduler=null;
			
			System.out.print("전화 상담 할당 방식을 선택하세요: ");
			String answer=sc.next();
			
			if(answer.equals("R") || answer.equals("r")) {
				//S1.getNextCall();
				//S1.sendCallToAgent();
				scheduler=new RoundRobin();
			}
			else if(answer.equals("L") || answer.equals("l")) {
				//S2.getNextCall();
				//S2.sendCallToAgent();
				scheduler=new LeasJob();
			}
			else if(answer.equals("P") || answer.equals("p")){
				//S3.getNextCall();
				//S3.sendCallToAgent();
				scheduler=new PriorityAllocation();
			}
			else {
				System.out.println("종료합니다. ");
				break;
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
			*/
		
		/* 방법3
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * while (true) {
		 * System.out.println("-------------------------------------------");
		 * System.out.println("R or r : 한명씩 차례로 할당");
		 * System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		 * System.out.println("P or p : 업무 skill 값이 높은 상담원 높은 상담원에게 할당");
		 * System.out.println("S or s : 종료"); System.out.print("전화 상담 할당 방식을 선택하세요 : ");
		 * //System.in.read(); //: 콘솔에 입력받기 모든 입력값을 아스키코드값 //int ch=System.in.read();
		 * //아스키코드값
		 * 
		 * String mun = scan.next(); }
		 */
	}
}
