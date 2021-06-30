package pk17;

public class StringBuilderTest {
	public static void main(String[] args) {
		String javastr=new String("Java");
		//처음 생성된 메모리의 주소
		System.out.println("javastr의 처음 생성된 메모리의 주소 : "+System.identityHashCode(javastr));
		
		//buffer 메모리 주소
		StringBuilder buffer=new StringBuilder(javastr);
		System.out.println("연산 전 buffer 메모리 주소 : "+System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append(" android ");
		buffer.append(" programming is fun!!");
		//buffer 메모리 주소
		System.out.println("연산 후 buffer 메모리 주소 : "+System.identityHashCode(buffer));
		
		javastr=buffer.toString();
		System.out.println("새로운 메모리 주소 : "+System.identityHashCode(buffer));
	}
}
