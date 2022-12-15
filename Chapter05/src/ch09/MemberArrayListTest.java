package ch09;

public class MemberArrayListTest {
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member member1 = new Member(1001, "김가영");
		Member member2 = new Member(1002, "김나영");
		Member member3 = new Member(1003, "김다영");
		Member member4 = new Member(1004, "김라영");
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);
		
		memberArrayList.showAllMember();
		System.out.println("==한 개 remove 해보기==");
		memberArrayList.removeMember(member1.getMemberId());
		memberArrayList.showAllMember();
		
	}
}
