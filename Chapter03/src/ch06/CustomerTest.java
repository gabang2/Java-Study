package ch06;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customer1 = new Customer(10010, "가영");
		Customer customer2 = new Customer(10010, "가영");
		Customer customer3 = new GoldCustomer(10010, "가영");
		Customer customer4 = new GoldCustomer(10010, "가영");
		Customer customer5 = new VIPCustomer(10010, "가영");
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		for(Customer customer : customerList) {
			System.out.println(customer.customerInfo());
		}
		
		int price = 10000;
		for(Customer customer:customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이" + cost + "를 지불하였습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는" + customer.bonusPoint + "입니다.");
		}
	}
}
