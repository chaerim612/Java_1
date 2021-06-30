package pk16;

import java.util.Scanner;

public class InStackTester {
	public static void main(String[] args) {
		//최대 64개를 push 할 수 있도록
		InStack s=new InStack(64);
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("현재 데이터 수 : "+s.size()+"/ 스택의 용량 : "+s.capacity());
			
			System.out.println("(1)푸쉬 (2)팝 (3)피크 (4)덤프 (0)종료 : ");
			
			int menu=sc.nextInt();
			
			if(menu==0) {
				break;
			}
			int x;
			switch (menu) {
			case 1:
				System.out.println("데이터 입력 : ");
				x=sc.nextInt();
				try {
					s.push(x);
				}
				catch (InStack.OverflowStackException e) {
					System.out.println("스택이 가득 찼습니다. ");
				}
				break;
			case 2:
				try {
					x=s.pop();
					System.out.println("pop한 데이터 : "+x);
				}
				catch(InStack.EmptyIntStackException e){
					System.out.println("스택이 비었습니다. ");
				}
				break;
			case 3:
				try {
					x=s.peek();
					System.out.println("peek한 데이터 : "+x);
				}
				catch(InStack.EmptyIntStackException e){
					System.out.println("스택이 비었습니다. ");
				}
				break;
			case 4:
				s.clear();
				System.out.println("스택을 비웠습니다. ");
				break;
			default:
				System.out.println("종료합니다. ");
				break;
			}
		}
	}
}
