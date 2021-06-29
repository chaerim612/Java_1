package pk16;

import javax.swing.JOptionPane;

class Out {
	static int a = 1; // 객체 생성과 상관 없이 사용 가능(독립)
	int b; // 반드시 객체를 통해 사용

	// 객체 생성과 상관 없이 사용 가능(독립)
	public static class In {
		static String Infunc() {
			return (a + "번째 Static 내부 클래스");
		}
	}

}

public class EmbedTest {
	public static void main(String[] args) {
		// System.out.println(Out.In.Infunc());
		String str = "";

		// 생략 static은 객체 없이 클래스명으로 접근
		Out obj = new Out();
		Out.In obj1 = new Out.In();
		str=obj1.Infunc();

		JOptionPane.showMessageDialog(null, str + "\n Success");

	}
}
