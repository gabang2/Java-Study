package ch19;

public class Car {
	private static int carNumTotal=10000;
	private int carNum;
	public Car() {
		carNumTotal++;
		carNum = carNumTotal;
	}
	public int getCarNum() {
		return carNum;
	}
}
