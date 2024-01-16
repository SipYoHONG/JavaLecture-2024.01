package ch04_control;

public class Ex992_연습문제 {

	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			if( i % 2 == 1) {
				continue;	// 홀수이면 continue 라는 문을 통해서 넘어가고 짝수는 출력됨.
			}				// 특정 조건에서는 현재 반복을 건너뛰고
			
			System.out.println(i); // 0, 2, 4, 6, 8, 10
			
			if (i == 10) {
				break;		// 마지막 숫자가 10이면 break로 루프종료!
			}				// 반복 중간에 특정 조건을 만족하면 반복 종료
		}
	}
}
