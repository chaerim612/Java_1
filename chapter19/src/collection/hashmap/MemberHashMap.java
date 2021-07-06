package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import collection.Member;

public class MemberHashMap {

	private HashMap<Integer,Member> hashMap; // 선언
	// 생성자

	public MemberHashMap() {
		hashMap = new HashMap<Integer,Member>(); // 메모리 확보
	}

	public void addMember(Member member) {
		hashMap.put(member.getMemberid(),member);
	}

	public boolean removeMember(int memberid) { // 멤버 아이디를 매개변수로 받음

		if (hashMap.containsKey(memberid)) {
			hashMap.remove(memberid);
			return true;

		}
		System.out.println(memberid + "가 존재하지 않습니다.");
		return false;

	}
	/*
	 * Iterator<Member> ir=arrayList.iterator();
	 * 
	 * while(ir.hasNext()) { Member member=ir.next(); int
	 * tempId=member.getMemberid(); if(tempId==memberid) { arrayList.remove(member);
	 * return true; }
	 * 
	 * }
	 */

	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			hashMap.get(ir);
			Member member=hashMap.get(key);
			System.out.println(member);
			
		}
		System.out.println("총 Entry 수 : "+hashMap.size());

	}

}
