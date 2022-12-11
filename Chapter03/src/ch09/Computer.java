package ch09;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing(); // 하위 클래스가 알아서 구현하라
	
	void turnOn() {
		System.out.println("전원을 컵니다.");
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
