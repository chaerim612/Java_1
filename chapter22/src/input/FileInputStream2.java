package input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream2 {
	public static void main(String[] args) {
		//바이트 단위로 읽음
		//FileInputStream fis=null
		//한글깨짐 방지법 : 문자단위로 읽어야함
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("input.txt");
			int i;
			//fis.read() : 끝까지 읽고 나면 -을 반환
			while((i=fis.read())!=-1) {
				System.out.println((char)i+" ");
			}
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println("end");
	}
}
