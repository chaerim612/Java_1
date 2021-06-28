package pk15;

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle=new Circle(10, 20, 30);
		Circle cpCircle=(Circle)circle.clone();
		
		//toString �޼��带 ������ Ŭ�����Ƿ� �ּҰ� �ƴ� ���� ����
		System.out.println(circle);
		System.out.println(cpCircle);
		
		//hash��
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cpCircle));
	}
}
