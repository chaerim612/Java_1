package pk15;

public class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId,String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
	}

	@Override
	public String toString() {
		return "�й�: "+studentId+" �̸� : "+studentName;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {	//equals(Student std)
		if(obj instanceof Student) {
			Student std=(Student)obj;
			//DataBase�� �ִ� ��(studentID)�� ���� �α����� ���� �Է��� ���� ������ ��
			if(studentId==std.studentId)
				return true;
			else return false;
		}
		return false;
	}
	
	

}
