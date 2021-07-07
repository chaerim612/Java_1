package reader;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) throws IOException {
		//한글깨짐
		FileInputStream fis=null;
		fis=new FileInputStream("reader.txt");
		
		int i;
		while((i=fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		fis.close();
		System.out.println("end");
	

	}

}
