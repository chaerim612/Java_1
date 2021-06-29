package pk15;

public class ValueCompareTest {

	public static void main(String[] args) {
		System.out.println("[-128 ~ 127 초과했을 경우]");//byte, int, short
		Integer obj1=300;
		Integer obj2=300;
		
		System.out.println("1. 결과 :  "+(obj1==obj2));//객체 주소
		System.out.println("2. 언박싱후 결과 : "+(obj1.intValue()==obj2.intValue()));//내부값 비교
		System.out.println("3. equals() 결과 : "+(obj1.equals(obj2))); //내부값 비교
		System.out.println();
		
		System.out.println("[-128 ~ 127 범위내]");//byte, int, short
		Integer obj3=30;
		Integer obj4=30;
		
		System.out.println("1. 결과 :  "+(obj3==obj4));//객체 주소
		System.out.println("2. 언박싱후 결과 : "+(obj3.intValue()==obj4.intValue()));//내부값 비교
		System.out.println("3. equals() 결과 : "+(obj3.equals(obj4))); //내부값 비교
		System.out.println();
		
		
	}

}
