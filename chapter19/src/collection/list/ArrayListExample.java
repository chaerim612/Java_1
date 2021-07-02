package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBO");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2를 입력하면 실제 주소!
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		
		String skill = list.get(2);
		System.out.println(skill);
		System.out.println();
		
		for ( int i=0 ;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		System.out.println();
		
		list.remove(2);
		
		for ( int i=0 ; i<size;i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}

}
