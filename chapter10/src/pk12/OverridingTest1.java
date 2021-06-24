package pk12;

//라이브러리
import test.Customer;
import test.VIPCustomer;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerLee=new Customer(10010, "이순신");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
        System.out.println("----------VIP----------"); 
        VIPCustomer customerKim=new VIPCustomer(10020, "김유신", 12345);
        customerKim.bonusPoint=10000;
        System.out.println(customerKim.showCustomerInfo());
        System.out.println();
        int price=10000;
        System.out.println(customerLee.getCustomerName()+"님이 지불 하야 할 금액은 "+
        customerLee.calcPrice(price)+"원 입니다.");
        System.out.println(customerKim.getCustomerName()+"님이 지불 하야 할 금액은 "+
        		customerKim.calcPrice(price)+"원 입니다.");
        

	}

}
