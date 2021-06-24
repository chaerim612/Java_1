package pk13;

public  class DeskTop extends Computer{

	
	//추상 클래스를 상속 받았을때는 반드시 추상클래스의 구현부를 완성하여야 한다
	@Override
	public void display() {
		System.out.println("DeskTop Display");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing");
		
	}

	
	
	
	

}
