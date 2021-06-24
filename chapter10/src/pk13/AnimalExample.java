package pk13;

public class AnimalExample {

	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
	public static void main(String[] args) {
		// 각각의 객체를 만들어서 Cat과 Dog의 사운드 메서드 호출
		System.out.println("----각각의 객체 생성----");
		Dog dog=new Dog();
		dog.sound();
		
		System.out.println();
		
		Cat cat=new Cat();
		cat.sound();
		
		System.out.println("----자동형변환(Upcasting)----");
		Animal animal=null; //초기화가 안되있는 상태 선언
		
		animal=new Dog(); //heap 할당
		animal.sound();
		
		System.out.println();
		
		animal=new Cat(); //heap 할당
		animal.sound();
		
		System.out.println("----메서드(매개변수) 사용----");
		animalSound(new Cat());
		System.out.println();
		animalSound(new Dog());
		
	}//main
	
}
