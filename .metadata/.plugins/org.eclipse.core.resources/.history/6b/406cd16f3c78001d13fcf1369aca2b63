package ch04;

public class CustomerTest {
	public static void main(String[] args) {
		// Customer class 사용해보기
		Customer customer1 = new Customer();
		customer1.setCustomerId(1);
		customer1.setCustomerName("김가영");
		System.out.println("금액은: " + customer1.calcPrice(10000));
		System.out.println(customer1.customerInfo());
		
		// VIPCustomer class(Customer class extends) 사용해보기
		VIPCustomer customer2 = new VIPCustomer();
		customer2.setCustomerId(2);
		customer2.setCustomerName("김나영");
		System.out.println("금액은: " + customer2.calcPrice(10000));
		System.out.println(customer2.customerInfo());
		
		// Customer class 사용해보기 - default constructer 사용 x
		Customer customer3 = new Customer(3, "김다영");
		System.out.println(customer3.customerInfo());
		
		// VIPCustomer class 사용해보기 - default cosntructor 사용 x
		VIPCustomer customer4 = new VIPCustomer(4, "김라영");
		System.out.println(customer4.customerInfo());
		
		// 업 캐스팅
		Customer customer5 = new VIPCustomer(5, "김마영");
		System.out.println(customer5.calcPrice(10000));
		/* customer5.salesRatio; <- VIP에만 salesRatio있음*/
		
		// 다운 캐스팅
		VIPCustomer customer6 = new VIPCustomer(6, "김사영");
	}
}
