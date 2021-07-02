package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		Member memberLim = new Member(1001, "dd");
		Member memberKim = new Member(1002, "ss");
		Member memberLee = new Member(1003, "ff");
		Member memberOh = new Member(1004, "gg");
		Member memberKang = new Member(1005, "aa");
		
		memberTreeSet.addMember(memberLim); 
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberOh);
		memberTreeSet.addMember(memberKang);
	
		memberTreeSet.showAllMember();
		System.err.println("-------------------------------------------");
		
		Member memberSon=new Member(1003,"김바바");
		memberTreeSet.addMember(memberSon);
		memberTreeSet.showAllMember();
		//memberHashSet.removeMember(1003);
		//memberHashSet.showAllMember();
		
	}

}
