package pk18_1;

public class GenEx_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String > 100
		GenEx<String> gstr = new GenEx<>();
		gstr.setValue("100");
		String gstr1 = gstr.getValue();
		System.out.println(gstr1);
		
		//Integer > 1000
		GenEx<Integer> gint = new GenEx<>();
		gint.setValue(1000);
		//Integer gint1 = gint.getValue();
		System.out.println(gint.getValue());
		
		//Character > 가
		GenEx<Character> gchar = new GenEx<>();
		gchar.setValue('가');
		Character gchar1 = gchar.getValue();
		System.out.println(gchar1);
		
		//Double > 3.14
		GenEx<Double> gdo = new GenEx<>();
		gdo.setValue(3.14);
		Double gdo1 = gdo.getValue();
		System.out.println(gdo1);
		
	}

}
