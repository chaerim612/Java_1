package collection.LinkedList;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		/* LinkedList
		 * 특정 인덱스에서 객체를 제거하거나 추가하게 되면 바로 앞 뒤에 변경이 발생하므로 
		   빈번한 객체의 삭제 삽입이 일어나는 Data구조에서는 ArrayList보다 좋은 성능을 갖고 있다. 
		*/
		
		LinkedList<String> mylist=new LinkedList<String>();
		
		mylist.add("A");
		mylist.add("B");
		mylist.add("C");
		
		System.out.println(mylist);
		mylist.add(1,"D");
		
		System.out.println(mylist);
		
		mylist.add("O");
		System.out.println(mylist);
		System.out.println(mylist.removeLast());
		
		System.out.println(mylist);
	}
}
