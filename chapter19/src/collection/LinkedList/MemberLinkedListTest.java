package collection.LinkedList;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		Member memberLim = new Member(1001, "dd");
		Member memberKim = new Member(1002, "ss");
		Member memberLee = new Member(1003, "ff");
		Member memberOh = new Member(1004, "gg");
		Member memberKang = new Member(1005, "aa");
		//memberArrayList의 객체가 addmember 메서드를 실행하고 메서드의 매개변수가 memberLim
		
		memberLinkedList.addMember(memberLim); //어레이리스트에 담아줄게
		memberLinkedList.addMember(memberKim);
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberOh);
		memberLinkedList.addMember(memberKang);
	
		memberLinkedList.showAllMember();
		System.err.println("-------------------------------------------");
		
		Member memberSon=new Member(1003,"김바바");
		memberLinkedList.addMember(memberSon);
		memberLinkedList.showAllMember();
	}

}
