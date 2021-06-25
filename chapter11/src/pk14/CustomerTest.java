package pk14;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customer=new Customer();
		
		System.out.println("----Buy----");
		Buy buyer=customer;
		buyer.buy();
		buyer.order();
		
		System.out.println("----Sell----");
		Sell seller=customer;
		seller.sell();
		seller.order();
		
		if(seller instanceof Customer) {
			Customer customer2=(Customer)seller;	//다운캐스팅
			System.out.println("------Down Chasting-----");
			customer2.buy();
			customer2.sell();
		}
		
		System.out.println("---Customer---");
		customer.order();
		
	}
}
