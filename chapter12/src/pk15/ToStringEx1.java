package pk15;

public class ToStringEx1 {
	public static void main(String[] args) {
		Book bk = new Book(200, "������");
		System.out.println(bk.toString());	//��ü�� �ּҰ� ��ȯ
		System.out.println(bk.toString());	//heap �޸� ������ ���ڿ� ��ȯ
		
		String str=new String("TEST");
		System.out.println(str);
	}

}

class Book {
	int bookNumber;
	String bookTitle;

	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	//������
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookTitle+", "+bookNumber;
	}
	
	
}
