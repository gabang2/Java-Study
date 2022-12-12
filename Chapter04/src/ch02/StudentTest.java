package ch02;

public class StudentTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student std1 = new Student(100, "Gayeong");
		Student std2 = new Student(100, "Gayeong");
		
		System.out.println(std1 == std2); // 물리적 주소가 다름
		System.out.println(std1.equals(std2)); // 논리적으로 같음
		
		System.out.println(std1.hashCode()); // 변경된 해쉬코드 == 사용시 용이
		System.out.println(std2.hashCode());
		
		System.out.println(System.identityHashCode(std1)); // 실제 해쉬코드
		System.out.println(System.identityHashCode(std2));
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// clone해보기
		std1.setStudentName("Gabang");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
	}
}
