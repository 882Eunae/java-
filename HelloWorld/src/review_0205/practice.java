package review_0205;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.yedam.collections.Person;

public class practice {
	public static void main(String[] args) {
		//List
		List<String> strList=new ArrayList<String>();
		strList.add("Hong"); 
		strList.add(new String("Kildong"));
		
		strList.add(new String("Eunae"));
		
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		} 
		
		//Map
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("홍길동", 90);
		map.put("김민수", 80); 
		map.put("김민수", 77); 
		
		Integer val=map.get("홍길동");
		Set<String> keys=map.keySet();
		for(String key:keys) {
			System.out.printf("키:%s ,값 :%d \n",key,map.get(key));
		}
		
		//키:값 엔트리 반환 
		Set<Entry<String,Integer>> entry=map.entrySet(); 
		for(Entry<String,Integer>ent:entry) {
			System.out.printf("키: %s, 값:%d\n",ent.getKey(),ent.getValue());
		}
			
		//map 컬렉션 
		Map<String,Person> student=new HashMap<String,Person>();  
		student.put(null, null); 
	}
}
