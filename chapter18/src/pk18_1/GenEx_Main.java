package pk18_1;

public class GenEx_Main {
	public static void main(String[] args) {
		GenEx<String> str=new GenEx<String>();
		str.setValue("100");
		String str1=str.getValue();
		System.out.println(str1);
		
		GenEx<Integer> Int=new GenEx<Integer>();
		Int.setValue(1000);
		int a=Int.getValue();
		System.out.println(a);
		
		GenEx<Character> ch=new GenEx<Character>();
		ch.setValue('a');
		char cha=ch.getValue();
		System.out.println(cha);
		
		GenEx<Double> d=new GenEx<Double>();
		d.setValue(3.14);
		double d1=d.getValue();
		System.out.println(d1);
	}
}
