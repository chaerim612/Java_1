package pk10;

public class Student1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 studentLee=new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		//studentLee.serialNum++;
		Student1.serialNum++;
		
		Student1 studentKim=new Student1();
		studentKim.setStudentName("손수경");
		System.out.println(studentKim.serialNum);
		

	}

}
