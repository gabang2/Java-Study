package ch03;

public class VIPCustomer extends Customer {
	// if else가 너무 많아질 여지가 있으면, 상속을 생각해봐라!
	
	// 추가 멤버 변수
	double salesRatio;
	private String agentId;
	
//	public VIPCustomer() {
//		super(0, null); // 쓰지 않아도 자동적으로 넣어줌(상위 클래스의 constructer)
//		
//		salesRatio = 0.1;
//		bonusRatio = 0.05;
//		customerGrade = "VIP";
//		
//		System.out.println("VIPCustomer() call");
//	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		salesRatio = 0.1;
		bonusRatio = 0.05;
		customerGrade = "VIP";
	}
	
	public String getAgentId() {
		return agentId;
	}
	
}
