package pk15;

	class Book{
	  
		int bookNumber;
		String bookTitle;
		
		
		public Book(int bookNumber, String bookTitle) {
			this.bookNumber=bookNumber;
			this.bookTitle=bookTitle;
		}

		//재정의
		@Override
		public String toString() {
			return bookTitle+ ", "+bookNumber;
		}
		
		
		
		
	}
	
public class ToStringEx1 {
	public static void main(String[] args) {
		
		Book bk=new Book(200, "강아지");
		
		System.out.println(bk);//객체의 주소값 반환
		System.out.println(bk.toString()); //heap메모리 데이터 문자열 처리
		
		String str=new String("TEST");
		System.out.println(str);

	}

}
