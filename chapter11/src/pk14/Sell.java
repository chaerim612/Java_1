package pk14;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("판매주문");
	}
}
