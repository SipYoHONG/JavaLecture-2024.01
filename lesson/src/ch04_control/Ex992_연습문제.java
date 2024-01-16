package ch04_control;

public class Ex992_연습문제 {

	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			if( i % 2 == 1) {
				continue;
			}
			
			System.out.println(i); // 0, 2, 4, 6, 8, 10
			
			if (i == 10) {
				break;
			}
		}
	}
}
