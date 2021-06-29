package pk16;

import javax.swing.JOptionPane;

class Out2{
	//멤버 변수(=인스턴스 변수 : 객체가 있어야 쓸 수 있는 변수) 데이터 영역에 있다
	static int a=1;
	String str="";
	
	public class In {//내부클래스
		
		//생성자 있음
		
		//메서드
		String Infunc() {
			return (a+"번째 Non-Static 내부 클래스"); 
		}
	}
	
}

public class NonStaticTest {
	public static void main(String[] args) {
		Out2 obj1=new Out2();
		//Out2.a=2;	//클래스를 끌고 오면 변수를 쓸 수 있다
		
		Out2.In obj2=obj1.new In();
		String str=obj2.Infunc();
		
		JOptionPane.showMessageDialog(null, str+"\n Success");
	}
}
