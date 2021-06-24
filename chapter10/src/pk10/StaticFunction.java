package pk10;

public class StaticFunction {
	
	String str1="일반 멤버변수";
	static String str2="Static 멤버변수";
	
	public static String getStatic() {
		
		//return str1; //ERROR: Static 내부에서는 Static 변수만 접근이 가능
		return str2;
	}

}
