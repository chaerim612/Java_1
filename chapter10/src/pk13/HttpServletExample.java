package pk13;

public class HttpServletExample {

	public static void method(HttpServlet servlet) {
		servlet.service();
	}
	
	public static void main(String[] args) {
		//생략가능 : 메서드에 매개변수로 객체가 설정되어 있음
		//즉 : HttpServlet servlet =new LoginServlet();
		//HttpServletExample ht=new HttpServletExample();
		method(new LoginServlet());
		method(new FileDownloadServlet());
		
	}
	
	

}
