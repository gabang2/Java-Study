package ch01;

public class AutoCloseTest {

	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()){
			throw new Exception(); //강제로 exception 호출해보기
		} catch(Exception e) {
		}
	}
}
