package ch12;

public class MemberHashSetTest {
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member member1 = new Member(1001, "김가영");
		Member member2 = new Member(1002, "김나영");
		Member member3 = new Member(1003, "김다영");
		Member member4 = new Member(1003, "김라영"); // 중복 여부에 대한 부분을 구현해주어야 한다.
		
		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		memberHashSet.addMember(member4);
		
		memberHashSet.showAllMember();
		System.out.println("==한 개 remove 해보기==");
		memberHashSet.removeMember(member1.getMemberId());
		memberHashSet.showAllMember();
		
	}
}
