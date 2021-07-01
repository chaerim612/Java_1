package pk18_1;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> powderPrint = new GenericPrinter<Powder>(); //파우더 타입
		powderPrint.setMaterial(new Powder());
		//형변환이 필요 없다.
		Powder powder = powderPrint.getMaterial();
		System.out.println(powder);
		
		powderPrint.printing();
		System.out.println("---------------------");
		
		GenericPrinter<Plastic> plasticPrint = new GenericPrinter<>(); //파우더 타입
		plasticPrint.setMaterial(new Plastic());
		Plastic plastic = plasticPrint.getMaterial();
		//plastic.toString();
		System.out.println(plastic);
		
		plasticPrint.printing();
		/*
		GenericPrinter<Water> waterPrint = new GenericPrinter<>(); //파우더 타입
		waterPrint.setMaterial(new Water());
		Water water = waterPrint.getMaterial();
		System.out.println(water);
		*/
		
	}

}
