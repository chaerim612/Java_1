package pk16;

public class StaticInner {
	
	//int a=10;	-> heap 메모리에 할당된 변수이기 때문에 data 영역에 있는 static 클래스로 호출할 수 없는 것이다. 
	//private int b=100;	-> heap 메모리에 할당된 변수이기 때문에 data 영역에 있는 static 클래스로 호출할 수 없는 것이다. 
	static int c=300;
	
	static class Inner{
		static int d=1000;
		
		public void getData() {
			//System.out.println("int a: "+a);
			//System.out.println("int b: "+b);
			System.out.println("static int c: "+c);
			System.out.println("static int c: "+c);
		}
	}
	public static void main(String[] args) {
		
		//방법1
		StaticInner.Inner inner=new StaticInner.Inner();
		inner.getData();
		
		
		//방법2: 메인 클래스를 이용했으므로 바로 사용 가능
		//Inner inner=new Inner();
		//inner.getData();
		
	}

}
