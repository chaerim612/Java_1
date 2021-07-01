package pk18;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreeDPrinter printPowder = new ThreeDPrinter();
		Powder p1 = new Powder();
		
		printPowder.setMaterial(p1);
		//다운캐스팅 : Powder가 Object타입의 매개변수를 갖고 있는메소드를 참조
		Powder p2 = (Powder)printPowder.getMaterial();
		System.out.println(p2);
		
		ThreeDPrinter printPlastic = new ThreeDPrinter();
		Plastic p3 = new Plastic();
		printPlastic.setMaterial(p3);
		
		Plastic p4 = (Plastic)printPlastic.getMaterial();
		System.out.println(p4);
		
		

	}

}
