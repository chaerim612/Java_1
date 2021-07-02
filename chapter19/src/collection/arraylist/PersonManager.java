package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {

	public void personManager() {
		int select;
		Person p;
		
		ArrayList<Person> personArr = new ArrayList<>();
		
		while(true) {
			
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료");
			System.out.println("----------------------------");
			System.out.print("항목선택 : ");
			
			Scanner s = new Scanner(System.in);
			select = s.nextInt();
			System.out.println("----------------------------");
			
			switch (select) {

			case 1: //정보추가(personArr)
				p = new Person();
				
				System.out.print("이름을 입력하세요 : ");
				p.setName(s.next());
				System.out.print("나이를 입력하세요 : ");
				p.setAge(s.nextInt());
				System.out.print("전화번호를 입력하세요 : ");
				p.setTel(s.next());
				
				personArr.add(p);
				
				System.out.println("정보가 저장 되었습니다.");
				System.out.println("----------------------------");
				break;
				
			case 2: //정보삭제
				System.out.println("---정보삭제---");
				
				
				System.out.print("삭제할 이름을 입력하세요 : ");
				String name = s.next();
				
				for(int i=0; i<personArr.size(); i++) {
					//if(name.equals(personArr.get(i).getName())) {
					if((personArr.get(i).getName()).equals(name)) {//데이터베이스에 있는 이름을 내가 지금 입력한 이름을 가지고 있어?
						//System.out.println(personArr.get(i).getName()+"의 정보를 삭제했습니다.");
						//personArr.remove(i);
						personArr.remove(i);
						System.out.println(name+"의 정보를 삭제했습니다.");
					}
					else {
						if(i+1==personArr.size()) //(생략가능) > if문에서 personArr 끝까지 다 돌았는지 확인해!
				//personArr의 크기가 5일때, if문에서는 4까지만 도는데 i+1을 해줘서 personArr 끝까지 다 돌았는데도 없으면
						System.out.println("입력하신 이름이 존재하지 않습니다.");
						break;
					}
				}
				break;
				
				//삭제할 이름이 있냐? 이름 확인 후 있으면 삭제!
				//get i로 가져와서 지워
				//--의 정보를 지웠습니다.
				//입력하신 이름이 존재하지 않습니다.
				
			case 3: //정보출력
				System.out.println("---정보 출력---");
				System.out.println("등록인원 : " + personArr.size() + "명 입니다.");
				
				/*
					for(int i=0; i<personArr.size();i++) {
						System.out.println(i+1 + "번 회원 정보 : ");
						System.out.println("이름 : " + personArr.get(i).getName());
						System.out.println("나이 : " + personArr.get(i).getAge());
						System.out.println("전화번호 : " + personArr.get(i).getTel());
					}
				 */
				Iterator<Person> it = personArr.iterator();
				
				while(it.hasNext()) {//가방 안에 이미 커서가 있음 > iterator안에 데이터가 있음
					p = it.next();//한줄씩 넘어가는 것을 p에 담아
					
					System.out.println("이름" + p.getName());
					System.out.println("나이" + p.getAge());
					System.out.println("번호" + p.getTel());
				}
				
				System.out.println("----------------------------");
				break;
				
			default:
				System.out.println("프로그램을 종료하겠습니다.");
				return;
			}

		}
		
	}

}
