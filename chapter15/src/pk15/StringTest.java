package pk15;

public class StringTest {

	public static void main(String[] args) {
		String str="";
		String str1="Hi everybody!";
		String str2=" Have a nice day!";
		
		System.out.println(System.identityHashCode(str1));
		
		//str=str1+str2;
		str1=str1.concat(str2);
		 System.out.println(str1);
		 
		System.out.println(System.identityHashCode(str1));
		
		System.out.println("str1 글자수 : "+str1.length());
		System.out.println("str2 글자수 : "+str2.length());
		
		System.out.println("str1 d글자위치 : "+str1.indexOf('d'));
		System.out.println("str2 d글자위치 : "+str2.indexOf('d'));
		
		
		System.out.println("str1 소문자 : "+str1.toLowerCase());
		System.out.println("str2 소문자 : "+str2.toLowerCase());
		
		System.out.println("str1 대문자 : "+str1.toUpperCase());
		System.out.println("str2 대문자 : "+str2.toUpperCase());
		
		
		

	}

}
