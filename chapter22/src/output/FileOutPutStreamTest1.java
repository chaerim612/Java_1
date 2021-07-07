package output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest1 {

	public static void main(String[] args) {
			//("output.txt",true) : 바이트 단위 출력이면서 덮어쓰기 안됨
			//자바 9이전은 ("output.txt",false) : 덮어쓰기 됨
		try (FileOutputStream fos=new FileOutputStream("output.txt",true)){
			fos.write(71);
			fos.write(72);
			fos.write(73);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
