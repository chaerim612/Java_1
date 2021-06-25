package pk14;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		
		Calc calc=new ComputerCalc();
		//추상x
		//Calc calc2=new Calculator();
		//calc.showInfo(); : ERROR : Calc타입이므로 Calc에 없는 메서드는 선언 불가능
		System.out.println("----------디폴트 메서드----------");
		calc.description();//디폴트 메서드 호출
		System.out.println();
		
		System.out.println("----------static 메서드----------");
		int[] arr= {1,2,3,4,5};
		System.out.println(Calc.total(arr));	//클래스명으로만 호출 가능(디폴트 메서드)
		System.out.println();
		
		System.out.println("----------인스턴스 메서드(추상)----------");
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		System.out.println("----------자식 메서드----------");
		ComputerCalc calc1=new ComputerCalc();
		calc1.showInfo();
	}
}
