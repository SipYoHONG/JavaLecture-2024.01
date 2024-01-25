package ch17_collection.part1_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex11_Sort {

	public static void main(String[] args) {
		List<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(86); scoreList.add(96); scoreList.add(76); scoreList.add(69); scoreList.add(91);
		
		// 오름차순 정렬
		scoreList.sort(Comparator.naturalOrder());
		System.out.println(scoreList);
		
		// 내림차순 정렬
		scoreList.sort(Comparator.reverseOrder());
		System.out.println(scoreList);
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("밤"); fruits.add("감"); fruits.add("배"); fruits.add("포도"); fruits.add("파인애플");
		fruits.sort(Comparator.naturalOrder());
		System.out.println(fruits);

		
	}

}
