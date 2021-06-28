package pk15;

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle=new Circle(10, 20, 30);
		Circle cpCircle=(Circle)circle.clone();
		
		//toString 메서드를 포함한 클래스므로 주소가 아닌 값이 나옴
		System.out.println(circle);
		System.out.println(cpCircle);
		
		//hash값
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cpCircle));
	}
}
