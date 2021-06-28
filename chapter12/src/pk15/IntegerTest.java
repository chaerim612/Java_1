/*
 > Wrapper class

기본 자료 타입
byte, short, int, long, float, double, String, char, boolean

래퍼 클래스 객체 타입
Byte, Short, Integer, Long, Float, Double, String, Character, Boolean


기본형에서 래퍼클래스로 변환 =>박싱(Boxing) : 포장객체로 만듬

래퍼클래스에서 기본자료형 => 언박싱(UnBoxing) : 자료형으로 변환
*/

package pk15;

public class IntegerTest {
	public static void main(String[] args) {
		//Integer i=new Integer(100);	//사용을 권장하지 않음
		Integer num=100;
		int iNum=num.intValue();	//Integer 클래스에서 값만 받음
		int jNum=200;
		
		//UnBoxing
		int sum=iNum+jNum;
		System.out.println(sum);
		
		//Boxing == AutoBoxing
		Integer i=jNum;
		System.out.println(i);		//Integer.valueOf()으로 변환
		
	}
}
