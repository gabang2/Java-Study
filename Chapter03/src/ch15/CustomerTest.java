package ch15;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		System.out.println("==========");
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order(); //seller것 출력됨
		System.out.println("==========");
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		System.out.println("==========");
	}
}
