package ch15;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("Customer Sell");	
	}
	
	@Override
	public void buy() {
		System.out.println("Customer Buy");
	}
	
	@Override
	public void order() {
		Sell.super.order(); //sell 실행
	}
	
}