package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		
		int[] ar = new int[10];
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("list.size : " + list.size());
		
		list.add(100);
		list.add(20);
		System.out.println("list.size : " + list.size());
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		
		//리스트의 자원을 반복자로 변환
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {//iterator 안에 커서가 존재하는지 유무를 판단//커서를 올려놓고 자료가 있는지 확인해보고 끌어옴
			int v = it.next(); //현재의 커서 위치에서 요소를 읽음
			
			System.out.println(v);
		}
		
	}

}
