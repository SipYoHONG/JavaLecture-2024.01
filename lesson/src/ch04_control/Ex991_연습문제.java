package ch04_control;

public class Ex991_연습문제 {

	public static void main(String[] args) {
		int score = 72;
			
			switch (score / 10) {
			case 9 :
				System.out.println("등급 A");
				break;
			case 8 :
				System.out.println("등급 B");
				break;
			case 7 :
				System.out.println("등급 C");
				break;
			default:
				System.out.println("등급 F");
			}

	}

}
