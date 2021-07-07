package other;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		//File : 파일에 대한 상세 정보 메서드가 활용되고 있는 클래스
		File file= new File("D:\\JAVA_PRO(0608)\\chapter22\\reader.txt");
		file.createNewFile();
		 
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath()); //절대경로
		System.out.println(file.getPath()); //상대경로
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		
		file.delete();
	}

}
