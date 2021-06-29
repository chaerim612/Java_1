package pk16;

public class Main {
	public static void main(String[] args) {
		A a=new A();
		
		//인스턴스 클래스객체 생성
		A.B b=a.new B();
		b.field1=3;
		b.method();
		
		//정적 클래스 객체 생성
		A.C c=new A.C();
		c.field1=2;
		c.field2=1;
		c.method2();
		c.method();
	}
}
