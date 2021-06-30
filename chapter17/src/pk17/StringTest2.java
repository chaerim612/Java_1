package pk17;

public class StringTest2 {
	public static void main(String[] args) {
		String javaStr=new String("java");
		String androidStr=new String("android");
		System.out.println(javaStr);
		System.out.println(javaStr.hashCode());//10진수
		System.out.println(System.identityHashCode(javaStr));
		
		System.out.println("------------------------------------------");
		javaStr=javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));
		
		int sum=0;
		sum=sum+1;
	}
}
