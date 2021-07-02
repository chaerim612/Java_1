package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberHashSet memberHashSet = new MemberHashSet();
		Member memberLim = new Member(1001, "dd");
		Member memberKim = new Member(1002, "ss");
		Member memberLee = new Member(1003, "ff");
		Member memberOh = new Member(1004, "gg");
		Member memberKang = new Member(1005, "aa");
		
		memberHashSet.addMember(memberLim); 
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberOh);
		memberHashSet.addMember(memberKang);
	
		memberHashSet.showAllMember();
		System.err.println("-------------------------------------------");
		
		Member memberSon=new Member(1003,"김바바");
		memberHashSet.addMember(memberSon);
		memberHashSet.showAllMember();
		//memberHashSet.removeMember(1003);
		//memberHashSet.showAllMember();
		
	}

}
