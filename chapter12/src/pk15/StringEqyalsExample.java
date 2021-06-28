package pk15;

public class StringEqyalsExample {
	public static void main(String[] args) {
		String strVal1=new String("홍길동");
		String strVal2="홍길동";
		
		if(strVal1==strVal2) {
			System.out.println("같은 String 객체 참조");
		}
		else {
			System.out.println("다른 String 객체 참조");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("다른 문자열 참조");
		}
		else {
			System.out.println("다른 문자열 참조");
		}
		
		
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		
		System.out.println(i1==i2);	//heap memory
		System.out.println(i1.equals(i2));	//내부
	}
}
