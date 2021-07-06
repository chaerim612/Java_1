package pk20;

interface PrintString{
	void showString(String str);
}

public class TestLambDa {
	
	public static void showMyString(PrintString p) {
		p.showString("lamda2");
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s+"world");
	}
	
	public static void main(String[] args) {
		//lambda
		PrintString ps=(str)->System.out.println(str);
		ps.showString("hello Lamda");
		
		//method
		showMyString(ps);
		
		//override
		PrintString reStr=returnString();
		reStr.showString("Hello ");
	}
}
