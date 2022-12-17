package ch04;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer1 = new Customer("이순신", 40);
		Customer customer2 = new Customer("김유신", 20);
		Customer customer3 = new Customer("홍길동", 13);
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		
		System.out.println("고객 명단을 출력합니다.");
		System.out.println("고객번호\t 이름\t 나이\t 비용\t");
		Stream<Customer> customerStreamList1 = customerList.stream();
		customerStreamList1.forEach(e -> System.out.println(e));

		System.out.println("\n여행의 총 비용을 계산합니다.");
		Stream<Customer> customerStreamList2 = customerList.stream();
		System.out.print("여행의 총 비용 : ");
		System.out.println(customerStreamList2.map(m -> m.getCustomerPrice()).reduce(0, (x, y) -> x+y));
		
		System.out.println("\n고객 중 20세 이상인 사람을 이름으로(가나다순)정렬하여 출력합니다.");
		Stream<Customer> customerStreamList3 = customerList.stream();
		System.out.print("고객 이름 : ");
		customerStreamList3.filter(f -> f.getCustomerAge() >= 20).forEach(e -> System.out.print(e.getCustomerName()+ " "));
		
		
		
		
		
	}
}
