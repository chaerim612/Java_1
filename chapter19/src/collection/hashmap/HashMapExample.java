package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		//Map 컬렉션 생성
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		//객체저장
		map.put("신길동", 185);
		map.put("홍길동", 165);
		map.put("이호진", 140);
		map.put("홍길동", 172);
		//객체 찾기
		System.out.println("총 엔트리 수 : " +map.size());
		//System.out.println("\t홍길동 : " + map.get("홍길동"));
		
		
		//객체를 하나씩 처리
		Set<String> keySet=map.keySet();//key만 추출
		
		Iterator<String> ks=keySet.iterator();
		while(ks.hasNext()) {
			String key=ks.next(); //이름 : 신길동
			Integer value=map.get(key); //신장 : 185
			System.out.println("\t"+key+": "+value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 엔트리 수 : " +map.size());
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>> es=entrySet.iterator();
		while(es.hasNext()) {
			Map.Entry<String, Integer> entry=es.next(); 
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println("\t"+key+": "+value);
		}
		System.out.println();
		
		//전체 삭제
		map.clear();
		System.out.println("총 엔트리 수 : " +map.size());

	}

}
