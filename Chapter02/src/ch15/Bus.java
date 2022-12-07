package ch15;

public class Bus {
	String busName;
	int busMoneyTotal;
	int busPassengerCount;
	
	public Bus(String busName) {
		this.busName = busName;
	}
	
	public void take(int busMoney) {
		busMoneyTotal += busMoney;
		busPassengerCount++;
	}
}
