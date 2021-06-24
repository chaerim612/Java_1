package pk12;

public class AnimalMain {

	public static void main(String[] args) {


		Bear b = new Bear();
		System.out.println( "---곰---" );
		System.out.println( "눈 : " + b.getEye() );
		System.out.println( "다리 : " + b.getLeg() );
		
		
		Lion l = new Lion();
		System.out.println("---사자---");
		System.out.println("눈 : " + l.getEye());
		System.out.println("다리 : " + l.getLeg());
		
		//부모타입으로 형변환
		Animal s = new Spider();
		System.out.println("---거미---");
		System.out.println("눈 : " + s.getEye());
		System.out.println("다리 : " + s.getLeg());
		
	}//main

}
