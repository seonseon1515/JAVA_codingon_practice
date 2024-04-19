package java_second;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		
//		add : 요소 추가
		list.add("Google");
		list.add("Samsung");
		list.add(1, "Amazon");
		System.out.println(list);
		
//		addAll: 여러 요소 일괄적으로 추가
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("apple");
		list2.add("Microsoft");
		list.addAll(list2);
		System.out.println(list);
		
//		size: 크기 확인
		System.out.println(list.size());
		
//		contains(params): ArrayList가 params를 포함하고 있는지 여부
		System.out.println(list.contains("Hyundai"));
	
//		get: 특정 요소에 접근
		System.out.println(list.get(2));
		
//		set(index, element): 인덱스에 위치한 값을 교체
		list.set(2, "Hundai");
		System.out.println(list);
		
//		indexOf: 요소의 인덱스값 찾기(있으면 인덱스 값, 없을 경우 -1)
		System.out.println(list.indexOf("Amazon"));
		
//		remove: 요소 삭제
		list.remove(0); // 인덱스 또는 요소 값 둘다 사용 가능
		System.out.println(list);
		
//		isEmpty: ArrayList가  비어있는지 확인
		System.out.println(list.isEmpty());
		
//		clear: 모든 요소 삭제
		list.clear();
		System.out.println(list);
		
	}
}
