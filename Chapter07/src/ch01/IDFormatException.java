package ch01;

// 8자 이하, 20자 이상인 경우 에러가 발생함
public class IDFormatException extends Exception{
	public IDFormatException(String message) {
		super(message);
	}
}