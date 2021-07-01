package pk18_1;

public class Powder extends Material{

	public String toString() {
		
		return "재료는 Powder입니다.";
	}

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("Powder 재료로 만듭니다.");
	}
}
