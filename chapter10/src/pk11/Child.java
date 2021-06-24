package pk11;

public class Child extends Parent{
	
	//재정의됨 
	@Override //생략가능
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}

}
