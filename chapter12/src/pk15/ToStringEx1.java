package pk15;

public class ToStringEx1 {
	public static void main(String[] args) {
		Book bk = new Book(200, "강아지");
		System.out.println(bk.toString());	//객체의 주소값 반환
		System.out.println(bk.toString());	//heap 메모리 데이터 문자열 반환
		
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
	
	//재정의
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookTitle+", "+bookNumber;
	}
	
	
}
