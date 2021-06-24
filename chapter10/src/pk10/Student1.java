package pk10;

public class Student1 {
	
	public static int serialNum=1000;
	int studentID;
	String StudentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	public static int getSerialNum() {
		int i=10;
		return serialNum;
	}


}
