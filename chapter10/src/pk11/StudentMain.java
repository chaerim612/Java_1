package pk11;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student("이호진", "123456-1234567",1);
		
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);

	}

}
