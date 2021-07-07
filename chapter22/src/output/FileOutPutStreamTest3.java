package output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest3 {

	public static void main(String[] args) throws IOException{
			//("output.txt",true) : 바이트 단위 출력이면서 덮어쓰기 안됨
			//자바 9이전은 ("output.txt",false) : 덮어쓰기 됨
		FileOutputStream fos=new FileOutputStream("output3.txt",true);
		try (fos){ //자바 9부터 가능
			
			byte[] bs=new byte[26];
			byte data=65; //'A' 
			for(int i=0;i<bs.length;i++) {//A-Z출력
				bs[i]=data;
				data++;
			}
			fos.write(bs, 2,10);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
