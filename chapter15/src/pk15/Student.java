package pk15;

public class Student {
	
	int studentid;
	String studentName;
	
	public Student(int studentid, String studentName) {
		this.studentid=studentid;
		this.studentName=studentName;
	}
	
	public String toString() {
		return studentid+ ", "+studentName;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentid;
	}

	@Override
	public boolean equals(Object obj) { //equals(Student std)
		
		if(obj instanceof Student) {
			Student std=(Student)obj;
			//DataBase에 있는 값(studentid)과 현재 로그인을 위해 입력한 값(td.studentid)이 같은지 비교
			if(studentid == std.studentid)
				return true;
			else return false;
		}
		return false;
	}
	
	
	

}
