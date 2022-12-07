package ch08;

public class Order {
	String orderNum;
	String orderPhone;
	String orderAddress;
	String orderDate;
	String orderTime;
	String orderPrice;
	String orderMenuNum;
	
	public void printOrder() {
		System.out.println("주문 접수 번호: " + orderNum);
		System.out.println("주문 핸드폰 번호: " + orderPhone);
		System.out.println("주문 집 주소: " + orderAddress);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문 시간: " + orderTime);
		System.out.println("주문 가격: " + orderPrice);
		System.out.println("메뉴 번호: " + orderMenuNum);
	}
}
