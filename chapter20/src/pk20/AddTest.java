package pk20;

public class AddTest {
	public static void main(String[] args) {
		Add addF=(x,y) -> x+y;
		
		//---------------------------------
		System.out.println(addF.add(3, 5));
		System.out.println(addF.add(4, 5));
		
	}
}
