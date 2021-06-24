package pk11;



public class Main {

	public static void main(String[] args) {
		
		ChildExam c1=new ChildExam();
		
		System.out.println(c1.getCar());//자식
		System.out.println(c1.getMoney()+"원");//부모
		
		//ChildExam는 곧 ParentExam
		//왼쪽의 객체가 오른쪽의 클래스의 인스턴스(즉 그 글래스로 만든 객체)
		//instanceof 연산자
		if(c1 instanceof ParentExam) 
			System.out.println("c1은 ParentExam의 자식 클래스 입니다.");
		
		System.out.println("1.------------------------------------------");
		
		ChildExam ch=new ChildExam();
		ParentExam p1=new ParentExam();
		
		p1=(ParentExam)ch; //자동 형변환 /오버라이딩 한 상태에서 부모클래스의 메서드를 사용하기 위해서
		ch=(ChildExam)p1; 
		
		//자식은 부모의 메서드와 자기 자신의 메서드를 모두 사용
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
		System.out.println("2.------------------------------------------");
	
		//반면
		p1=ch; //부모에 자식을 대입해도(자동 형변환)
		//부모는 부모의 기능만 사용
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		
		
		System.out.println("3.------------------------------------------");
		//이렇게 쓰는 경우는 많지않음
		System.out.println(((ChildExam)p1).getCar());
		
	}

}
