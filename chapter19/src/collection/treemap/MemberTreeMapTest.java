package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap memberTreeMap=new MemberTreeMap();

		//Member 클래스의 객체
		Member memberPark=new Member(1003, "박진우");
		Member memberChoi=new Member(1004, "최지원");
		Member memberKim=new Member(1002, "김태호");
		Member memberHong=new Member(1005, "홍길동");
		Member memberLee=new Member(1001, "이호진");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberChoi);
		memberTreeMap.addMember(memberHong);
		
		memberTreeMap.showAllMember();
		System.err.println("----------------------------");
		//Member memberJung=new Member(1006, "정약용");
		//memberHashMap.addMember(memberJung);
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();
		
		
		
		
		
	}

}
