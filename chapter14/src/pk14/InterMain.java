package pk14;

public class InterMain implements Inter_Menu3 {

	@Override
	public String jajang() {
		// TODO Auto-generated method stub
		return "하나죽으면 아는 짜장면";
	}

	@Override
	public String jjambbong() {
		// TODO Auto-generated method stub
		return "짬뽕이냐? 잠뽕이냐?";
	}

	@Override
	public String tangsuyuck() {
		// TODO Auto-generated method stub
		return "찹쌀 탕수육";
	}

	@Override
	public String boggembab() {
		// TODO Auto-generated method stub
		return "다섞어 볶음밥";
	}
	
	public static void main(String[] args) {

       InterMain im=new InterMain();
       
       System.out.println("---우리집 메뉴판---");
       Inter_Menu1 im1=im;
       Inter_Menu2 im2=im;
       Inter_Menu3 im3=im;
       
       System.out.println(im.jajang());
       System.out.println(im1.jjambbong());
       System.out.println(im2.tangsuyuck());
       System.out.println(im3.boggembab());
       
       
       
       
       
       
       
       
       
       

	}

}
