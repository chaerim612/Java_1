package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import collection.Member;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map=new HashMap<String,Integer>();
		
		//객체 저장
		map.put("김뫄뫄", 158);
		map.put("박뫄뫄", 147);
		map.put("최뫄뫄", 168);
		
		//객체 찾기
		//System.out.println("\t 홍길동: "+map.get("홍길동"));
		System.out.println("\t총 엔트리 수 : "+map.size());
		
		//객체 하나씩 처리
		Set<String> keySet=map.keySet();
		Iterator<String> ks=keySet.iterator();
		while(ks.hasNext()) {
			String key=ks.next();
			Integer value=map.get(key);
			System.out.println("\t"+key+": "+value);
		}
		
		System.out.println("\t총 엔트리 수 : "+map.size());
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>>  es=entrySet.iterator();
		while(es.hasNext()) {
			Map.Entry<String, Integer> entry=es.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println("\t"+key+": "+value);
		}
		System.out.println();
		
		//전체 삭제
		map.clear();
		System.out.println("\t총 엔트리 수 : "+map.size());
		
		
		
	}
}
