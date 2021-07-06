package pk20;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		List<TravelCustomer> customerlist=new ArrayList<TravelCustomer>();
		TravelCustomer customerLee=new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim=new TravelCustomer("김유신", 50, 100);
		TravelCustomer customerHong=new TravelCustomer("홍길동", 30, 50);
		
		customerlist.add(customerLee);
		customerlist.add(customerKim);
		customerlist.add(customerHong);
		
		System.out.println("==고객 명단 추가된 순서대로 출력==");
		//각 객체의 요소 중 이름만 mapping하여 출력함
		customerlist.stream().map(c->c.getName()).forEach(s->System.out.println(s+" "));
		System.out.println();
		//price만 mapping하여 sum()로 합계 출력
		int total=customerlist.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 여행 비용:"+total);
		
		System.out.println("--20세 이상의 고객을 정렬하여 출력--");
		//정렬은 매핑한 뒤에...
		customerlist.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s+" "));
		
	}
}
