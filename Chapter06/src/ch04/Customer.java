package ch04;

public class Customer{
	
	private int customerId;
	private String customerName;
	private int customerAge;
	private int customerPrice;
	
	public Customer(int customerId, String customerName, int customerAge) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
		
		if (this.customerAge >= 15) this.customerPrice = 100;
		else this.customerPrice = 50;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public int getCustomerPrice() {
		return customerPrice;
	}
	
	public void customerShow() {
		System.out.println(customerId + "\t" + customerName + "\t" + customerAge + "\t" + customerPrice);
	}

	@Override
	public int hashCode() {
		return this.customerId;
	}

	@Override
	public String toString() {
		return this.customerName;
	}
	

}
