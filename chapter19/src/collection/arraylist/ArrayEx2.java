package collection.arraylist;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		//5명 추가, 
		list.add("선생님");
		list.add("저희도");
		list.add("사탕");
		list.add("주세요");
		list.add("맛있겠다");
		
		System.out.println(list);
		System.out.println();
		//2, 0번째 출력
		System.out.println(list.get(2));
		System.out.println(list.get(3));
	}

}
