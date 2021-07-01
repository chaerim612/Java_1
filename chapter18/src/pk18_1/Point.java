package pk18_1;

public class Point<T, V> {
	
	//멤버변수
	T x; //p1 0		p2 10
	V y; //p1 0.0 	p2 10.0
	
	//생성자
	public Point(T x, V y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	//메서드
	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
	
}
