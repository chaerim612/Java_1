package pk15;

public class ExtendsExampleMain {

	public static void main(String[] args) {
		 //String
		 ExtendsExample v1=new ExtendsExample();
		 v1.setValue("TEST");
		 System.out.println(v1.getValue());
		 
		 //Integer
		 ExtendsExample v2=new ExtendsExample();
		 //값받기
		 v2.setValue(100); //AutoBoxing(자동 형변환=>객체)
		 
		 //언박싱(vr5 이하)
		// int i=(Integer)v2.getValue(); //Integer => int
		 //언박싱(vr5 이상)
		 int i=(int)v2.getValue(); //Object
		 System.out.println(i+10);
		 
	}

}
