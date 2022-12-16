package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String st1, String st2) {
		return st1.compareTo(st2) * (-1);
	}
	
}

public class MemberTreeSetTest {
	public static void main(String[] args) {
		
//		TreeSet set = new TreeSet<String>();
//		set.add("홍길동");
//		set.add("강감찬");
//		set.add("이순신");
//		
//		System.out.println(set); // String 클래스에 Comparable 클래스를 상속했기 때문에 정렬 기능 사용 가능
//		
//		MemberTreeSet memberTreeSet = new MemberTreeSet();
//		
//		Member member1 = new Member(1001, "김가영"); // Memeber가 Comparable 클래스를 구현하지 않았기 때문에 Comparable interface를 상속해주어야 한다.
//		Member member2 = new Member(1002, "김나영");
//		Member member3 = new Member(1003, "김다영");
//		//Member member4 = new Member(1003, "김라영"); // 중복 여부에 대한 부분을 구현해주어야 한다.
//		
//		memberTreeSet.addMember(member1);
//		memberTreeSet.addMember(member2);
//		memberTreeSet.addMember(member3);
//		//memberTreeSet.addMember(member4);
//		
//		memberTreeSet.showAllMember();
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		set.add("Park");
		set.add("KIm");
		set.add("Lee");
		
		System.out.println(set);
	}
}
