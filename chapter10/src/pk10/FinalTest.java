package pk10;

import javax.swing.JOptionPane;

public class FinalTest {

	private static final int MAX=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		for(int i=0;i<MAX;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("값입력"));
			if(num>MAX)
				System.out.println("입력값이 3보다 큽니다");
			else
				System.out.println("입력값이 3보다 크지않습니다.");
		}

	}

}
