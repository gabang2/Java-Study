package ch02;

public class VIPCustomer extends Customer {
	// if else가 너무 많아질 여지가 있으면, 상속을 생각해봐라!
	
	// 추가 멤버 변수
	double salesRatio;
	private String agentId;
	
	public VIPCustomer() {
		salesRatio = 0.1;
		bonusRatio = 0.05;
		customerGrade = "VIP";
	}
	
	public String getAgentId() {
		return agentId;
	}
	
}
