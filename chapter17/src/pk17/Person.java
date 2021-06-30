package pk17;

public class Person {
	private String name;
	private int age;
	
	//String name
	public Person(String name) {
		this.name=name;
	}
	
	//String name, String age
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * @Override public String toString() { 
	 * // TODO Auto-generated method stub
	 * return name; }
	 */
	
	
}
