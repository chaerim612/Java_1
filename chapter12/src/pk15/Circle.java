package pk15;

//������ private�� ����ǹǷ� �ݵ�� Cloneable�� ����
public class Circle implements Cloneable{//=Circle�� ������ ������ Ŭ�����̴�
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
		return "������ "+point+"�̰�, �������� "+radius+"�Դϴ�. ";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
