package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{

	private static final long serialVersionUID = -3250194140145292632L;
	String name;
	String job;

	public Person() {

	}

	public Person(String name,String job) {
		this.name=name;
		this.job=job;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+","+job;
	}
	
}

public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException{
		Person personHong=new Person("홍길동","대표이사");
		Person personKim=new Person("김미란","상무이사");
		
		try (FileOutputStream fos=new FileOutputStream("serial.out");
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
			oos.writeObject(personKim);
			oos.writeObject(personHong);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (FileInputStream fis=new FileInputStream("serial.out");
				ObjectInputStream ois=new ObjectInputStream(fis)){
			Person p1=(Person)ois.readObject();
			Person p2=(Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
