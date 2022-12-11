package ch10;

public class CarTest {

	public static void main(String[] args) {
		Car aCar = new AICar();
		aCar.run();
		
		Car mCar = new ManualCar();
		mCar.run();
	}

}
