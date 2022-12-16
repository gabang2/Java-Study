package ch14;

import java.util.Comparator;
import java.util.HashMap;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String st1, String st2) {
		return st1.compareTo(st2) * (-1);
	}
	
}

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberhashMap = new MemberHashMap();
		
		Member member1 = new Member(1001, "김가영"); // Memeber가 Comparable 클래스를 구현하지 않았기 때문에 Comparable interface를 상속해주어야 한다.
		Member member2 = new Member(1002, "김나영");
		Member member3 = new Member(1003, "김다영");
		Member member4 = new Member(1003, "김라영"); // 중복 여부에 대한 부분을 구현해주어야 한다.
		
		memberhashMap.addMember(member1);
		memberhashMap.addMember(member2);
		memberhashMap.addMember(member3);
		memberhashMap.addMember(member4);
		
		memberhashMap.showAll();
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1001, "kim");
		hashMap.put(1002, "kim");
		hashMap.put(1003, "kim");
		hashMap.put(1004, "kim");
		
		System.out.println(hashMap);
		
	}
}
