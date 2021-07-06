package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer,Member> treeMap; // 선언
	// 생성자

	public MemberTreeMap() {
		treeMap = new TreeMap<Integer,Member>(); // 메모리 확보
	}

	public void addMember(Member member) {
		treeMap.put(member.getMemberid(),member);
	}

	public boolean removeMember(int memberid) { // 멤버 아이디를 매개변수로 받음

		if (treeMap.containsKey(memberid)) {
			treeMap.remove(memberid);
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
		Iterator<Integer> ir=treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key=ir.next();//키를 찾음
			Member member=treeMap.get(key);//해당 키의 값을 가져옴
			System.out.println(member);
		}
		System.out.println();
	}

}
