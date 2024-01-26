package ch17_collection.ex02;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String studentID = entry.getKey();
			int score = entry.getValue();
			
		    if (score > maxScore) {
                maxScore = score;
                name = studentID;
            }

		}
		
		int sum = map.values().stream().mapToInt(Integer::intValue).sum();
		double avg = sum / map.size();

		// 결과 출력
		System.out.println("평균 점수: " + avg);
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 학생 ID: " + name);
	}
}