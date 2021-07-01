package pk18_1;

public class GenMain {

	public static void main(String[] args) {
		
		Gen gen = new Gen();
		//정수형 배열 선언
		//int[] iArr= {1,2,3,4,5};
		Integer[] iArr= new Integer[] {1,2,3,4,5};
		
		//더블형 배열 선언
		Double[] dArr = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		//문자형 배열 선언
		Character[] cArr = {'a', 'b', 'c', 'd', 'e'};
		
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
		/*int, double, char와 가은 기본자료형들로 만들면 대입이 불가,
		 * 반드시 제네릭을 이용하는 객체로 처리해야 한다.
		 */
	}
}
