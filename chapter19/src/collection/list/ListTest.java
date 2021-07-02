package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<>(); //ctrl + shift + o
		//Vector<String> os1 = new Vector<>(); //동기화때문에 스레드 처리할때 주로 사용됨!
		
		//리스트에 데이터 추가
		ls.add("Hi!");
		ls.add("Have");
		ls.add("a Nice Day!");
		
		for(int i=0; i<ls.size();i++) 
			System.out.println(i + ":" +ls.get(i).toString()); //toString >> 객체 해시코드가 아닌 입력한 것 그대로 출력됨
		System.out.println();
		
		System.out.println("---데이터 추가 후 ---");
		ls.add(3, "EveryOne");
		for(int i=0; i<ls.size();i++) 
			System.out.println(i + ":" +ls.get(i).toString());
		System.out.println();
		
		System.out.println("---데이터 추가 후 ---");
		ls.remove(0);
		for(int i=0; i<ls.size();i++) 
			System.out.println(i + ":" +ls.get(i).toString());
		System.out.println();
		
	
		
		
	}
}
