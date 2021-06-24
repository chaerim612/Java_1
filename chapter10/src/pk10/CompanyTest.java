package pk10;



public class CompanyTest {

	public static void main(String[] args) {
		// 일반적인 객체생성 
		/*
		Company company1=new Company();
		Company company2=new Company();
		
		System.out.println(company1);
		System.out.println(company2);
		*/
		System.out.println("--------------------------");
		
		// 객체를 하나만 생성할 수 있는 singleton
		Company mycompany1=Company.getInstance();
		Company mycompany2=Company.getInstance();
		System.out.println(mycompany1);
		System.out.println(mycompany2);
		System.err.println(mycompany1==mycompany2);
		
	}

}
