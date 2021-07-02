package collection.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<UserInfo> arr = new ArrayList<>(); //userinfo 전용 가방
		
		outer: while(true) {
			System.out.println("아이디 생성: ");
			Scanner scan = new Scanner(System.in);
			
			//아이디를 입력 >> 새로운 유저인포 객체 생성
			UserInfo user = new UserInfo();
			String id = scan.next();
			//setId 메서드 이용
			user.setId(id);
			
			//중복된 아이디 입력안됨
			for ( int i=0; i<arr.size(); i++) {
				if(user.getId().equals(arr.get(i).getId())) {
				System.out.println("아이디가 중복되었습니다.");
				continue outer;
				}
			}//for
			
			System.out.println("패스워드 입력 : ");
			int pwd = scan.nextInt();
			user.setPwd(pwd);
			
			arr.add(user);//arr 방에 user 객체를 넣어줌!
			
			//디폴트 생성자가 많은 경우 아래와 같이 사용할 수도 있음
			//arr.add(new UserInfo());
			
			for(int i=0; i<arr.size();i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println();
			}
		}

	}

}
