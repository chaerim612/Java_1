package writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try (FileWriter fw=new FileWriter("Writer.txt")){
			
			fw.write('A');
			char buf[]= {'B','C','D','E','F','G'};
			
			fw.write(buf); //문자 배열 출력
			fw.write("안녕하세요 잘 저장됩니다.");//String 출력
			fw.write(buf, 1,2);//일부 저장
			fw.write("65");//숫자를 그대로 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
