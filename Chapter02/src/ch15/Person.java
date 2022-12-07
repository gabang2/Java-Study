package ch15;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		this.money -= 1200;
		bus.take(1200);
	}
	
	public void takeSubway(Subway subway) {
		this.money -= 1700;
		subway.take(1700);
	}
	
	public void takeTaxi(Taxi taxi) {
		this.money -= 10000;
		taxi.take(10000);
	}
	
	public void personInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
