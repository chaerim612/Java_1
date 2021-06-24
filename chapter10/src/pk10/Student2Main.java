package pk10;

public class Student2Main {

	public static void main(String[] args) {

		Student2 studentLee=new Student2();
		
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.StudentName);
		System.out.println("이름 : "+ studentLee.StudentName + " | 학번 : "
							+studentLee.studentID);
		
		Student2 studentKim=new Student2();
		studentKim.setStudentName("손수경");
		System.out.println(studentKim.StudentName);
		System.out.println("이름 : "+ studentKim.StudentName + " | 학번 : "
							+studentKim.studentID);

	}

}
