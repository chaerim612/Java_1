package collection.treeset;
import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	//생성자
	public MemberTreeSet() {
		// TODO Auto-generated constructor stub
		treeSet = new TreeSet<Member>();
	}

	public void addMember(Member member) {// 멤버에 해당하는 리스트만 등록
		treeSet.add(member);
		// 멤버아이디를 받아서 새로 입력한 아이디랑 가지고 있는 아이디 비교

	}

	public boolean removeMember(int memberid) { // 멤버아이디를 매개변수로 받음

		Iterator<Member> ir = treeSet.iterator();
		{
			while (ir.hasNext()) {
				Member member = ir.next();
				int tempId = member.getMemberid();
				if (tempId == memberid) {
					treeSet.remove(member);
					return true;
				} // if
			}
		}
		return false;

	} // for

	public void showAllMember() {

		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
