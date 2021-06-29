package pk14;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=5;
		
		Calc calc1=new ComputerCalc();
		//추상클래스 X
		//Calc calc2=new Calculator();
		//calc1.showInfo(); //ERROR : Calc타입이므로 Calc에 없는 메서드는 선언불가능
		
		System.out.println("----디폴트 메서드----");
		calc1.description(); //디폴트 메서드 호출
		System.out.println();
		
		System.out.println("----static 메서드----");
		int[] arr= {1,2,3,4,5};
		System.out.println("1~5까지의 합 : "+Calc.total(arr)); //디폴트 메서드 호출
		System.out.println();
		
		System.out.println("----인스턴스 메서드(추상) 호출----");
		System.out.println(calc1.add(num1, num2));
		System.out.println(calc1.substract(num1, num2));
		System.out.println(calc1.times(num1, num2));
		System.out.println(calc1.divide(num1, num2));
		
		System.out.println("--------child Method--------");
		ComputerCalc calc=new ComputerCalc();
		calc.showInfo();
			
		

	}

}
