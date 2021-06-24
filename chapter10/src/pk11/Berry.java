package pk11;

import javax.swing.JOptionPane;

public class Berry extends Fruit{
	
	private String size;
	private String name;
	
	public void Set2(String a, String b) {
		size=a;
		name=b;
	}
	
	public void Disp2() {
		System.out.println("이름 : "+name);
		System.out.println("크기 : "+size);
		
	} 
}
