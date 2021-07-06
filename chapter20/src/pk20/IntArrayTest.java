package pk20;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		//stream 생성
		IntStream stream=Arrays.stream(arr);
		
		//stream 사용 sum()에 사용
		int sum=stream.sum();
		System.out.println(sum);
		
		//stream 사용 count()에 사용
		//int cnt=(int)stream.count(); //ERROR
		
		//stream 객체 생성 후 연산을 수행하는 코드
		IntStream stream2=Arrays.stream(arr);
		int count=(int)stream2.count();
		
		int cnt=(int) Arrays.stream(arr).count();
		System.out.println(cnt);
		
		//stream 재생성
		System.out.println(Arrays.stream(arr).reduce(0,(a,b)->a+b));
		
	}
}
