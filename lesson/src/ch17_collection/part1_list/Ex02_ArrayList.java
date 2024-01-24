package ch17_collection.part1_list;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02_ArrayList {
	
	public static void main(String[] args) {
// 		overroding을 해줬기 때문에 쓸수있음!
		
		List<String> list = new ArrayList<>();			// 대부분 이와 같이 사용
		
		ArrayList<String> aList = new ArrayList<>();	// 잘 쓰지않는 형태
		
		list.add("class"); list.add("interface"); list.add("inheritance"); 
		System.out.println(list);
		
		List<String> fruitList = Arrays.asList(new String[] {"apple", "banana", "cherry"});
		System.out.println(fruitList);
//		fruitList.add("mango");		// 정적인 리스트, 추가/삭제가 안됨
		
		// 프리미티브 타입은 Wrapper 클래스로 리스트를 생성해야 함
		List<Integer> numList = new ArrayList<>();
		numList.add(1); numList.add(3); numList.add(5);
		System.out.println(numList);
		
		// 추출(인덱싱)
		System.out.println(list.get(1));

		
		// 데이터 추가
		list.add("list");			// 맨 뒤에 추가됨
		list.add(3, "collection");	// 3번 인덱스 앞으로 추가
		System.out.println(list);
		list.addAll(fruitList);		// 맨 뒤에 컬랙션 추가
		System.out.println(list);
		
		// 데이터 변경
		list.set(5, "set");
		System.out.println(list);
		
		// 데이터 삭제
		list.remove(6);					// 6번 인덱스 값 삭제
		list.remove("cherry");			// 체리 엘리먼트 삭제
		System.out.println(list);
		numList.clear();				// 리스트 전체 원소 삭제
		
		// 정보 추출	
		System.out.println(list.isEmpty() + ", " + numList.size());
		System.out.println(list.contains("set") + ", " + list.indexOf("list"));		// 없으면 음의 수 , 있으면 양의 수
		
		
	}
}
