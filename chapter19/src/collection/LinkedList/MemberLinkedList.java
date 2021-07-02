package collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

import collection.Member;

public class MemberLinkedList {

	private LinkedList<Member> linkedList;

	public MemberLinkedList() {
		// TODO Auto-generated constructor stub
		linkedList = new LinkedList<Member>();
	}
	
	public void addMember(Member member) {//멤버에 해당하는 리스트만 등록함!
		linkedList.add(member);
		//멤버아이디를 받아서 새로 입력한 아이디랑 가지고 있는 아이디랑 똑같냐?
		
	}
	
	public boolean removeMember(int memberid) { //멤버아이디를 매개변수로 받음
		/*
		for (int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberid();
			
			if(tempId == memberid) {
				arrayList.remove(i);
				return true;
			}//if
			
		}//for
		*/
		
		Iterator<Member> it = linkedList.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			
			int tempId = member.getMemberid();
			if(tempId == memberid) {
				linkedList.remove(member); //객체를 날리는 단서가 memberid이라는 의미
				return true;
			}//if
		}//while
		System.out.println("일치하는 ID가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		
		for (Member member:linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
