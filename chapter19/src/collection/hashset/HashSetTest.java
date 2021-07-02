package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		
		hashSet.add(new String("김머머"));
		hashSet.add(new String("박머머"));
		hashSet.add(new String("최머머"));
		hashSet.add(new String("이머머"));
		hashSet.add(new String("윤머머"));
		
		System.out.println(hashSet);
		
		boolean b1=hashSet.add(new String("임뫄뫄"));
		System.out.println(b1);
		
	}
}
