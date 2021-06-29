package pk15;

public class EqualsTest {

	public static void main(String[] args) {
		Student studentLee=new Student(10000, "김자바");
		Student studentLee2=studentLee;
		Student studentSang=new Student(10000, "김자바");
		
		System.out.println("동일한 주소의 두 인스턴스 비교");
		if(studentLee==studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다");
		else 
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다");
		
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일합니다");
		else 
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다");
		System.out.println();
		// =============================================================
		System.out.println("다른 주소의 두 인스턴스 비교");
		if(studentLee==studentSang)
			System.out.println("studentLee와 studentSang의 주소는 같습니다");
		else 
			System.out.println("studentLee와 studentSang의 주소는 다릅니다");
		
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang는 동일합니다");
		else 
			System.out.println("studentLee와 studentSang는 동일하지 않습니다");
		System.out.println();
		// ==============================================================
		
		System.out.println("데이터 값 출력");
		System.out.println("studentLee의 hashCode : " +studentLee.hashCode());
		System.out.println("studentSang의 hashCode : " +studentSang.hashCode());
		System.out.println();
		// =================================================================
		
		System.out.println("Student의 실제 값 출력");
		System.out.println("studentLee의 실제 값 : " +System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 값 : " +System.identityHashCode(studentSang));
		System.out.println();
		
		
		
	}

}
