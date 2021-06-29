package pk15;


//복제는 private에 위배되므로 반드시 복제권한(Cloneable)를 선언
public class Circle implements Cloneable{
	
	Point point;
	int radius;
	

	public Circle(int x, int y, int radius) {
		//Point클래스의 객체생성 Point point=new Point(x,y)
		point=new Point(x, y); 
		this.radius=radius;	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "원점은 "+point+"이고"+" 반지름은 "+radius+"입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
