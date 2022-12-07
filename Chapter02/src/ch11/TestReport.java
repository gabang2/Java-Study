package ch11;

public class TestReport {

	public static void main(String[] args) {
		MakeReport builder = new MakeReport();
		String report = builder.getReport(); // 사용하는 쪽에서 어느 정보를 공개하는 것이 편한지 생각하고 코딩해야 함.
		System.out.println(report);
	}
}
