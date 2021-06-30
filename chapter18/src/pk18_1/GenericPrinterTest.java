package pk18_1;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrint=new GenericPrinter<Powder>();
		powderPrint.setMaterial(new Powder());
		
		Powder powder=powderPrint.getMaterial();
		System.out.println(powder);
		powder.doPrinting();
		
		GenericPrinter<Plastic> plasticPrint=new GenericPrinter<Plastic>();
		plasticPrint.setMaterial(new Plastic());
		
		Plastic plastic=plasticPrint.getMaterial();
		System.out.println(plastic);
		plastic.doPrinting();
		
		GenericPrinter<Water> waterPrint=new GenericPrinter<Water>();
		waterPrint.setMaterial(new Water());
		
		Water water=waterPrint.getMaterial();
		System.out.println(water);
		water.doPrinting();
	}
}
