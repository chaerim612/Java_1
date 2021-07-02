package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("박부인");
		treeSet.add("전우치");
		
		for(String str:treeSet) {
			System.out.println(str);
		}
	}

}
