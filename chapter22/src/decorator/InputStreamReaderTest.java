package decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
	try (InputStreamReader isr=new InputStreamReader(new FileInputStream("reader.txt"))){
	int i;
	while((i=isr.read()) != -1) { //보조스트립
		System.out.print((char)i);
	}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	
	//소켓통신
	Socket socket=new Socket();
	try {
		//바이트 단위=> 문자단위
		InputStreamReader br=new InputStreamReader(socket.getInputStream());
		//문자를 한줄씩 읽어들이기
		//BufferedReader br2=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		br.read();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	}

}
