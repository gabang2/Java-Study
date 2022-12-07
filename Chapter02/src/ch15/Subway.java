package ch15;

public class Subway {
	String subwayName;
	int subwayMoneyTotal;
	int subwayPassengerCount;
	
	public Subway(String subwayName) {
		this.subwayName = subwayName;
	}
	
	public void take(int subwayMoney) {
		subwayMoneyTotal += subwayMoney;
		subwayPassengerCount++;
	}
}
