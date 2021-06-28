package pk15;

class Bk{
	String title;
	String author;
	
	
	public Bk(String title,String author) {
		this.title=title;
		this.author=author;
	}
	
	@Override
	public String toString() {
		return "책 제목: "+title+"\t"+" 저자 : "+author;
	}
	
	
}

public class ToStringEx2 {
	public static void main(String[] args) {
		Bk bk=new Bk("어린왕자","생택쥐페리");
		
		System.out.println(bk.toString());
		
		
	}
}
