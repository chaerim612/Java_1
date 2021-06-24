package test;



public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	
	//생성자 이용(고객의 아이디, 이름, 상담원아이디)
	//생성자 이용 (등급=VIP, bonusRatio=0.05, saleRatio,
	public VIPCustomer(int customerID, String cutomerName, int agentID) {
		super(customerID, cutomerName);
		this.agentID=agentID;
		
		customergrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		
	}
	
	//calcPrice =>Overriding
	//return 5000-(5000*0.1) saleRatio활용
	@Override
	public int calcPrice(int price) {
		bonusPoint+=bonusRatio*price;
		return super.calcPrice(price)-(int)(price*saleRatio);
	}
	
	//showCustomerInfo() =>Overriding
	@Override
	public String showCustomerInfo() {
		// 부모클래스의 메서드를 사용하고 상담원아이디 추가
		return super.showCustomerInfo()+" 담당 상담원 번호는 "+agentID+"입니다." ;
	}
	
	//상담원 아이디
	public int getAgentID() {
		return agentID;
	}

	
}
