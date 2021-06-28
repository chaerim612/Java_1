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
		return "학번: "+studentId+" 이름 : "+studentName;
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
			//DataBase에 있는 값(studentID)과 현재 로그인을 위해 입력한 값이 같은지 비교
			if(studentId==std.studentId)
				return true;
			else return false;
		}
		return false;
	}
	
	

}
