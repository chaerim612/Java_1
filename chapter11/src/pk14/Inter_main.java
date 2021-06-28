package pk14;

public class Inter_main implements Inter_menu3{
	public static void main(String[] args) {
		Inter_main im=new Inter_main();
		
		System.out.println("-----------메뉴판-----------");
		
		Inter_menu1 im1=im;
		System.out.println(im1.jajang());
		System.out.println(im1.jambbong());
		
		Inter_menu2 im2=im;
		System.out.println(im2.tansuyuck());
		
		Inter_menu3 im3=im;
		System.out.println(im3.boggmbab());
	}

	@Override
	public String jajang() {
		// TODO Auto-generated method stub
		return "짜장";
	}

	@Override
	public String jambbong() {
		// TODO Auto-generated method stub
		return "짬뽕";
	}

	@Override
	public String tansuyuck() {
		// TODO Auto-generated method stub
		return "탕수육";
	}

	@Override
	public String boggmbab() {
		// TODO Auto-generated method stub
		return "볶음밥";
	}
}
