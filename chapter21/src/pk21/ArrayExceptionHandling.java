package pk21;

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 */

		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외처리 부분");
		} finally {// 에러가 나든 안나든 무조건 수행
			System.out.println("finally");
		}
		System.out.println("프로그램 종료");
	}
}
