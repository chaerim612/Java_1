package pk11;



public class CustomerTest {

	public static void main(String[] args) {

		//일반고객 정보(Customer)
		System.out.println("----------일반고객----------");
		Customer customerLee=new Customer(); //고객등급 포인트 적용율
		customerLee.setCustomerName("이호진");//CustomerName
		
		int price =10000;
		int leePrice=customerLee.calcPrice(price);//bonusPoint
		System.out.println(customerLee.showCustomerInfo());
		System.err.println(customerLee.getCustomerName()+"님이 "+leePrice+"원을 지불했습니다.");
		
		System.out.println("-------------------VIP--------------------");
		
		Customer customerKim=new VIPCustomer(10001, "김태호", 1004);
		int kimPrice=customerKim.calcPrice(price);
		System.out.println(customerKim.showCustomerInfo());
		System.err.println(customerKim.getCustomerName()+"님이 "+kimPrice+"원을 지불했습니다.");
		

	}

}
