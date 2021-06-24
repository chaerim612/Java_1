package pk10;

public class Guest {
	
	//필드 : 이름과 성별 private
	private String name;
	private String gender;
	
	//생성자 생략
	
	public String getPoint() {
		//원래는 객체 생성하여 접근해야하지만 static이므로 클래스명으로 접근 가능
		return Guide.point;
	}

	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	

}
