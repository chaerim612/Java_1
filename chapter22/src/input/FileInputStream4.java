package input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream4 {
	public static void main(String[] args) {
		try (FileInputStream fis=new FileInputStream("input2.txt")){
			//버퍼
			byte[] bs=new byte[10];
			int i;
			while((i=fis.read(bs))!=-1) {
				//버퍼읽기 10개씩 가베지값 출력
				for(int b=0;b<i;b++) {
					System.out.print((char)bs[b]);
				}
				System.out.println();
				System.out.println(i+"바이트 읽음");
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
}
