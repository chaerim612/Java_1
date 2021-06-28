package pk15;

//복제는 private에 위배되므로 반드시 Cloneable를 선언
public class Circle implements Cloneable{//=Circle은 복제가 가능한 클래스이다
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		// TODO Auto-generated constructor stub
		point=new Point(x,y);
		this.radius=radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "원점은 "+point+"이고, 반지름은 "+radius+"입니다. ";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
