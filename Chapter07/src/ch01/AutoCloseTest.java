package ch01;

public class AutoCloseTest {

	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()){
			throw new Exception(); //������ exception ȣ���غ���
		} catch(Exception e) {
		}
	}
}
