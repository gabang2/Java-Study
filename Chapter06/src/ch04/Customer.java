package ch04;

public class Customer{
	
	private static int customerStaticId = 0;
	private int customerId;
	private String customerName;
	private int customerAge;
	private int customerPrice;
	
	public Customer(String customerName, int customerAge) {
		this.customerName = customerName;
		this.customerAge = customerAge;
		
		if (this.customerAge >= 15) this.customerPrice = 100;
		else this.customerPrice = 50;
		customerStaticId++;
		this.customerId = customerStaticId;
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


	@Override
	public int hashCode() {
		return this.customerId;
	}

	@Override
	public String toString() {
		return customerId + "\t" + customerName + "\t" + customerAge + "\t" + customerPrice;
	}
}
