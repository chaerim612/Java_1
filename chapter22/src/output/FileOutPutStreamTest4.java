package output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest4 {
	public static void main(String[] args) throws IOException{
			
		FileOutputStream fos=null;
		fos=new FileOutputStream("output4.txt", true);
		
		fos.write(65);
		fos.write(66);
		fos.write(67);
		fos.write(68);
		
		fos.flush();//출력버퍼 비울때
		fos.close();

		System.out.println("파일이 생성되었습니다.");
		
 }
}