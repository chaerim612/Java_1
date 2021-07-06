package collection.hashmap;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno,String name) {
		this.sno=sno;
		this.name=name;
	}
	
	/* hashcode가 재정의(물리적인 주소) 되어있지 않으면 super클래스의 주소를 반환하므로 
	 * sno와 name로 재정의하여 entry의 중복을 막아줘야 한다. 
	 * 일반적으로 equals(논리적인 주소)를 통해 재정의된 멤버변수를 사용한다. */
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student=(Student)obj;//다은캐스팅(obj가 상위 클래스니까!)
			return (sno==student.sno) && (name.equals(student.name));
		}
		else
			return false;
	}
	
	//hashCode의 주소를 sno와 name으로 사용하도록 구현
	public int hashCode() {
		return sno+name.hashCode();
	}

}
