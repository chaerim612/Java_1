package pk15;


class Bk{
	
	String title;
	String author;
	
	Bk(String title, String author){
		this.author=author;
		this.title=title;
	}

	@Override
	public String toString() {
		
		return author + ",  "+title;
	}
	
}


public class TostringEx2 {

	public static void main(String[] args) {
		
		Bk book=new Bk("JAVA", "Soldesk");
		
		System.out.println(book);
		System.out.println(book.toString());
	}

}
