package pk20;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<String>();

		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

		// 람다식
		// sList의 요소들이 Stream클래스로 입력 된다.
		System.out.println("=====lambda=====");
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		// 확장 for문
		System.out.println("=======for=====");
		for (String s : sList) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("=====sorted=====");
		//ArrayList에 있는 요소들을 정렬해서 출력
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println("=====method maping=====");
		//글자수 세는 것
		//정렬 안되어 있는 상태
		sList.stream().map(s->s.length()).forEach(s -> System.out.print(s + " "));
		
		System.out.println("=====filter=====");
		//조건 넣어서 필터링함
		//조건 : 글자 수가 5 이상인 것만 출력
		sList.stream().filter(a->a.length()>=5).forEach(s -> System.out.print(s + " "));
	}
}
