package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//BufferedInputStream, BufferedOutputStream : 컴파일 속도를 향상 시켜주는 보조 스트림
public class FileCopyTest2 {

	public static void main(String[] args) {
		
		long millisecond=0;

		try (FileInputStream fis=new FileInputStream("a.zip");
				FileOutputStream fos=new FileOutputStream("copy.zip");
				 BufferedInputStream bis=new BufferedInputStream(fis);
					BufferedOutputStream bos=new BufferedOutputStream(fos)){
				
			
			millisecond=System.currentTimeMillis();
			
			int i;
			while((i=bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond=System.currentTimeMillis()-millisecond;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일을 복사 하는 데 "+millisecond+" milliseconds가 소요 되었습니다.");	
	}

}
