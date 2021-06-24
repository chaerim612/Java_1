package pk13;

public class SmartPhone extends Phone{

	//생성자
	public SmartPhone(String owner) { //생성자안에 생성자호출
		super(owner); //super(owner) = Phone(owner)
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
		
	}
	
}
