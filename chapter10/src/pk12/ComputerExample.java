package pk12;

public class ComputerExample {

	public static void main(String[] args) {
		int r=10;
		Calculator calculator=new Calculator();
		System.out.println("원의 넓이 : " +calculator.areaCircle(10));
		
		Computer computer=new Computer();
		System.out.println("원의 넓이 : " +computer.areaCircle(10));

	}

}
