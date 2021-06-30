package pk17;

public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1=new Person("홍길동");
		System.out.println(person1.toString());
		
		Class pClass=Class.forName("pk17.Person");
		System.out.println(pClass);
		//곧 없어질 메서드
		Person person2=(Person)pClass.newInstance();
		System.out.println(person2);
		
		String str="";
		
	}
}
