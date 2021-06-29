package pk14;

public class MyClassTest {

	public static void main(String[] args) {
		
		//구현 메서드 즉 재정의된 메서드 사용가능
		MyClass mClass=new MyClass();
		X xClass=mClass; //자동 형변환
		xClass.x();
		System.out.println("================");
	
		Y yClass=mClass;
		yClass.y();
		System.out.println("================");
		
		MyInterface iClass=mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();

	}

}
