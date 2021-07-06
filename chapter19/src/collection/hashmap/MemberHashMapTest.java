package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap=new MemberHashMap();

		//Member 클래스의 객체
		Member memberLee=new Member(1001, "이호진");
		Member memberKim=new Member(1002, "김태호");
		Member memberPark=new Member(1003, "박진우");
		Member memberChoi=new Member(1004, "최지원");
		Member memberHong=new Member(1005, "홍길동");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberChoi);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		System.err.println("----------------------------");
		//Member memberJung=new Member(1006, "정약용");
		//memberHashMap.addMember(memberJung);
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
		
		
		
	}

}
