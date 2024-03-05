package sec3;

import java.util.Hashtable;
import java.util.Set;

public class HashtableExam {

	public static void main(String[] args) {
		// Hashtable
		Hashtable<String, Integer> hash = new Hashtable<>();
		hash.put("서울", 1);
		hash.put("부산", 2);
		hash.put("인천", 3);
		hash.put("대구", 4);
		hash.put("대전", 5);
		hash.put("광주", 6);
		hash.put("울산", 7);
		
		System.out.println("****hashtable****");
		//hashtable의 요소의 수를 출력
		System.out.println("엔트리 수 : " + hash.size());
		
		//hashtable에 키가 "광주"인 요소 존재 확인
		if (hash.containsKey("광주")) {
			System.out.println("키가 광주인 요소 존재");
		} else {
			System.out.println("키가 광주인 요소 없음");
		}
		
		//hashtable의 키만 Set으로 저장한 후 출력
		Set<String> keySet = hash.keySet();
		System.out.println("keySet : " + keySet);
		//>>>대괄호로 keyset 출력
	
		
		//키가 "대구"인 요소 제거
		hash.remove("대구");
		
		
		//순회하여 모든 엔트리의 키값 출력
		for (String s : hash.keySet()) {
			System.out.println("모든 엔트리");
			System.out.println(s + " : " + hash.get(s));
			
		}
		
		// clear
		hash.clear();
		System.out.println(hash);
	}

}
