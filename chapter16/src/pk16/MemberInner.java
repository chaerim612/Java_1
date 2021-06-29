package pk16;

public class MemberInner {
	
	//멤버변수
	int a=10;
	private int b=100;
	static int c=200;
	
	//내부 클래스
	class Inner{
		public void printDate() {
			System.out.println("int a: "+a);
			System.out.println("int b: "+b);
			System.out.println("int c:"+c);
		}
	}
	
	
	public static void main(String[] args) {
		//main 클래스 객체 생성
		MemberInner outer=new MemberInner();	
		
		//내부 클래스 객체 생성
		//메인 클래스의 객체 outer를 통해서 객체르 생성해야 한다. 
		MemberInner.Inner inner=outer.new Inner(); //<=두줄
		//MemberInner.Inner inner=new MemberInner().new Inner(); //<=한줄
		
		inner.printDate();
	}

}
