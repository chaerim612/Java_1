package pk14_2;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		System.out.println("-------Buy-------");
		Buy buyer=customer;
		buyer.buy();
		buyer.order(); //오버라이딩된 order 출력
		
		System.out.println("-------Sell-------");
		Sell seller=customer;
		seller.sell();
		seller.order();
		
		if(buyer instanceof Customer) {
			Customer customer2=(Customer)buyer; //다운캐스팅
			System.out.println("-------Down Chasting-------");
			customer2.buy();
			customer2.sell();
		}
		
		System.out.println("---Customer---");
		customer.order();
	}

}
