package pk18_1;

public class GenericPrinter<T extends Material> { //extends Material은 제약조건! >> material을 상속받은 타입만 매개변수로 받을거야!
	
	private T material; //oo타입의 객체

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
	
	public void printing() {//매서드 안에 또다른 객체 메서드가 존재
		material.doPrinting();
	}
	
}
