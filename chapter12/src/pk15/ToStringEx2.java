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
		return "å ����: "+title+"\t"+" ���� : "+author;
	}
	
	
}

public class ToStringEx2 {
	public static void main(String[] args) {
		Bk bk=new Bk("�����","�������丮");
		
		System.out.println(bk.toString());
		
		
	}
}
