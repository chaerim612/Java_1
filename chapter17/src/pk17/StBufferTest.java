package pk17;

public class StBufferTest {
	public static void main(String[] args) {
		String str = "";
		StringBuffer buf = new StringBuffer("Nice Day!!!");

		// 문자열 처리
		System.out.println(buf.toString());
		// 문자열 크기
		System.out.println(buf.length());
		// 용량(기본 16에 문자열 크기 추가)
		System.out.println(buf.capacity());
		// 용량 증가
		buf.ensureCapacity(26);
		System.out.println(buf.capacity());
		// 문자열에 새로운 문자열의 일부 내용 제거
		buf.insert(0, "Hi! ");
		buf.insert(13, " Everyone! ");
		System.out.println(buf);
		// StringBuffer 문자열의 일부 내용 제거
		buf.delete(0, 4);
		System.out.println(buf);
	}
}
