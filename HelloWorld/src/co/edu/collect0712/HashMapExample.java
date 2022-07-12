package co.edu.collect0712;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 키와 값을 함께 저장하는 타입을 => Map이라고 한다.
 */
public class HashMapExample {
	public static void main(String[] args) {
		//왼쪽은 키, 오른쪽은 벨류로 사용될 제너럴 타입
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		map.put("고길동", 80);
		map.put("마이콜", 85);
		map.put("차둘리", 92);
		map.put("고길동", 89); //키가 동일한 값이면 val을 새로운 값으로 변경
		
		int score = map.get("고길동"); // 값을 얻으려고 키를 get(키)사용한다
		System.out.println(score);
		
		map.remove("고길동");
		
//		반복요소
		Set<String> keySet = map.keySet(); //키에 해당되는 값들을 새로운 Set컬렉션에 저장
		
//		확장 for
		for(String key :  keySet) {
			Integer val = map.get(key);
			System.out.println("키: " + key + ", 값:" + val);
		}
		
//		키, 값 => entrySet()
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for (Entry<String, Integer> ent : entrySet) {
			String key = ent.getKey(); //키에 해당 값을 준다
			Integer val = ent.getValue(); //값
			
			System.out.println("키: " + key + ", 값: " + val);
		}
	}

}
