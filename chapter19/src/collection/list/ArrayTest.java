package collection.list;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iArray[]= {50, 40, 30, 20, 10};
		String sArray[] = new String[5];
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray); //오름차순
		System.out.println(Arrays.toString(iArray));
		
		Arrays.fill(sArray, "Hi!");
		System.out.println(Arrays.toString(sArray));
		
		List<String> City = Arrays.asList("Seoul", "Incheon", "Busan","Deajeon","Jeju");
		
		for(int i=0;i<City.size();i++) {
			System.out.println(City.get(i).toString());
		}
	}

}
