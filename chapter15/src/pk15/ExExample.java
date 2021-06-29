package pk15;

public class ExExample {

	public static void main(String[] args) {

		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				System.exit(i);
				//break;
			}
		}
		//System.exit(i); 사용시에는 컴파일 되지 않는 부분
		System.out.println("END!!"); 

	}

}
