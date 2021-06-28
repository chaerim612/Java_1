package pk15;

import java.util.ArrayList;

class MyBook implements Cloneable{
	String title;
	
	public MyBook(String title) {
		// TODO Auto-generated constructor stub
		this.title=title;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public String toString() {
		return title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class ObjectArrayClone{
	
	public static void main(String[] args) {
		ArrayList<MyBook> booklist=new ArrayList<MyBook>();
		
		MyBook book1=new MyBook("�ڹ�");
		MyBook book2=new MyBook("���̽�");
		MyBook book3=new MyBook("�ȵ���̵�");
		
		booklist.add(book1);
		booklist.add(book2);
		booklist.add(new MyBook("���̽�"));
		
		//===============================
		
		ArrayList<MyBook> copylist=(ArrayList)booklist.clone();
		copylist.add(new MyBook("C++"));
		System.out.println(booklist);
		System.out.println(copylist);
		
		book3.setTitle("C���");
		System.out.println(booklist);
		System.out.println(copylist);
		System.out.println(book3);
	}
	
}