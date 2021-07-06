package pk21;

public class AutoCloseTest {
	public static void main(String[] args) {
		AutoCloseObj obj2=new AutoCloseObj();
		try (obj2){
			throw new Exception();//예외 발생
		} catch (Exception e) {
			System.out.println("예외 발생 부분");
		}
	}
}
