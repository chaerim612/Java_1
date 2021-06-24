package pk10;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("관광객 수 : ");
		int n=scan.nextInt();
		//초기화되면서 메모리 확보및 객체생성(Guide에서 Guest의 객체 생성)
		Guide guide=new Guide(n);
		
		System.out.println("관객객 등록");
		for(int i=0;i<n;i++) {
			
			System.out.print((i+1) +". 이름 : ");
			guide.guest[i].setName(scan.next());
			
			System.out.print((i+1) +". 성별 : ");
			String gen=scan.next();
			guide.guest[i].setGender(gen);
			
			System.out.println("-----------------------");
		}
		
		outer : while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택>> ");
			
			int select=scan.nextInt();
			
			switch(select) {
			case 1:
				for(int i=0;i<n;i++) {
					System.out.println((i+1) + ". 이름 : "+ guide.guest[i].getName());
					System.out.println((i+1) + ". 성별 : "+ guide.guest[i].getGender());
					System.out.println((i+1) + ". 목적지 : "+ guide.guest[i].getPoint());
				}
					break;
			case 2:
				System.out.print("어디로 변경하시겠습니까? ");
				Guide.point=scan.next();
				System.out.println(Guide.point + "로 목적지 변경");
				System.out.println("---------------------");
				break;
			case 3:
				System.out.println("종료");
				break outer;
				
			}
			
		}

	}

}
