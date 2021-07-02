package collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


//Comparator : 정렬을 재정의 할 때 
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return (s1.compareTo(s2))*-1;//*-1 : 반대로 정렬한다는 뜻(내림차순)
	}
}

public class ComparatorTest2 {
	public static void main(String[] args) {
		//String 클래스에서 기본적으로 default 정렬이 되었음
		Set<String> set=new TreeSet<String>();
		set.add("aaa");
		set.add("sss");
		set.add("ddd");
		set.add("fff");
		
		System.out.println(set);
	}
}
