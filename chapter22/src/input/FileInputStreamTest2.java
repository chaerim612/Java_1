package input;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		//바이트 단위로 읽음
		//FileInputStream fis=null;
		//한글깨짐 방지법 : 문자단위로 읽어야함
		FileReader fis=null;
		try {
			fis=new FileReader("input.txt");
			int i;
			//fis.read(): 끝까지 읽고 나면 -1을 반환
			while((i = fis.read())!=-1) {
				System.out.print((char)i+" ");
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
				
			} catch (NullPointerException e){
				System.out.println(e);
			}
		}
		System.out.println("end");

	}

}
