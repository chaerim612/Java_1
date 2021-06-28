package pk15;

import javax.swing.JOptionPane;

public class WrapperTest {
	public static void main(String[] args) {
		String str1="";
		String str2="";
		double num1,num2;
		char ch=65;	//ascii 'A'
		
		num1=Double.parseDouble(JOptionPane.showInputDialog("값1"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("값2"));
		
		//UnBoxing
		if(num2!=0) {
			System.out.println(num1/num2);
		}
		if(Character.isDigit(ch)) {
			System.out.println(ch+"는 문자가 아닙니다. ");
		}
		else {
			
		}
	}
}
