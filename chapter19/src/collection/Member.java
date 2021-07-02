package collection;

import java.util.Comparator;

//Comparable : Override => compareTo
//Comparator : Override => compare(이미 정렬되어 있는 데이터 재정렬)
public class Member implements Comparable<Member>, Comparator<Member>{
	
	private int memberid;
	private String memberName;
	
	public Member(int memberid, String memberName) {
		this.memberid = memberid;
		this.memberName = memberName;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + "회원님의 아이디는 "+ memberid + "입니다.";
	}
	//물리적인 주소 JDK에서 주는 주소를 사용하지 않음
	//개발자가 임의로 정하여 heap메모리 주소를 지정
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberid;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member=(Member)obj;	//다운캐스팅
			if(this.memberid==member.memberid)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		return (this.memberid - member.memberid)*(-1);
	}

	@Override
	public int compare(Member member1, Member member2) {
		// TODO Auto-generated method stub
		return (member1.memberid - member2.memberid);
	}
	
	
	
	

}
