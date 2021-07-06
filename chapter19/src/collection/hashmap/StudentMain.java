package collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {
	public static void main(String[] args) {
		//해당 학생의 점수를 보관
		Map<Student,Integer> map=new HashMap<>();
		
		map.put(new Student(1,"홍길동"),95);
		map.put(new Student(1,"홍길동"),95);
		map.put(new Student(1,"홍길동"),95);
		
		//저장됨 총 entry수 얻기
		System.out.println("총 Entry수 : "+map.size());
	}
}
