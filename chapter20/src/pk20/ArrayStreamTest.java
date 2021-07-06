package pk20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayStreamTest {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 }; // int는 collection에 속한 클래스가 아님(일반 배열임)

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------일반 Array--------");

		Arrays.stream(arr).forEach(i -> System.out.println(i + " ")); // 그래서 collection화 시킴
		// Arrays.stream(arr).sorted().forEach(i->System.out.println(arr[i]));

		System.out.println("--------collection Array----------");
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		/*
		 * collection에서 합을 구하는 법은 reduce와 stream의 sum 두 가지 방법이 존재 단, stream에서의 sum()은
		 * IntStream,DoubleStream,LongStream과 같은 기본형(primitive) 특화 stream 보통의 방법은
		 * mapToInt, mapToDouble, mapToLong의 메서드로 사용
		 */
		// intValue() : Integer -> int로 언박싱
		int sum1 = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println("------mapToInt------");
		System.out.println(sum1);
	}
}
