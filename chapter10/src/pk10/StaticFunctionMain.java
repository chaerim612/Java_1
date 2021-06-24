package pk10;

public class StaticFunctionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 일반적인 방법(객체선언=>heap)
		StaticFunction st=new StaticFunction();
		System.out.println(st.str2);*/
		
		//Static메서드는 클래스명.메서드로 접근이 적합하다
		String str;
		str=StaticFunction.getStatic();
		
		System.out.println("str = " +str);
		 
		
		
		
	}

}
