package pk17;

import java.util.StringTokenizer;

public class StTokenizerTest {
	public static void main(String[] args) {
		String str="Have a Nice Day";
		
		//StringTokenizer(자르고 싶은 String, 자르는 기준 문자열, 자르는 기준 여부 표시)
		StringTokenizer obj=new StringTokenizer(str," ",false);
		
		//StringTokenizer.hasMoreTokens() : 다음 Token 존재 확인
		while(obj.hasMoreTokens()) {
			String t=obj.nextToken();
			System.out.println(t);
		}
	}
}
