/*
 > Wrapper class

�⺻ �ڷ� Ÿ��
byte, short, int, long, float, double, String, char, boolean

���� Ŭ���� ��ü Ÿ��
Byte, Short, Integer, Long, Float, Double, String, Character, Boolean


�⺻������ ����Ŭ������ ��ȯ =>�ڽ�(Boxing) : ���尴ü�� ����

����Ŭ�������� �⺻�ڷ��� => ��ڽ�(UnBoxing) : �ڷ������� ��ȯ
*/

package pk15;

public class IntegerTest {
	public static void main(String[] args) {
		//Integer i=new Integer(100);	//����� �������� ����
		Integer num=100;
		int iNum=num.intValue();	//Integer Ŭ�������� ���� ����
		int jNum=200;
		
		//UnBoxing
		int sum=iNum+jNum;
		System.out.println(sum);
		
		//Boxing == AutoBoxing
		Integer i=jNum;
		System.out.println(i);		//Integer.valueOf()���� ��ȯ
		
	}
}
