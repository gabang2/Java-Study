package ch01;

public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("close()가 실행되었습니다.");
	}
	
}
