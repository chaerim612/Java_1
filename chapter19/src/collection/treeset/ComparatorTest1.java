package collection.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest1 {
	public static void main(String[] args) {
		//String 클래스에서 기본적으로 default 정렬이 되었음
		Set<String> set=new TreeSet<String>();
		
		set.add("aaa");
		set.add("sss");
		set.add("ddd");
		
		System.out.println(set);
	}
}
