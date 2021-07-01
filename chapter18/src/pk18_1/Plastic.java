package pk18_1;

public class Plastic extends Material{

	public String toString() {
		
		return "재료는 Plastic입니다.";
	}

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("Plastic 재료로 만듭니다.");
		
	}
}
