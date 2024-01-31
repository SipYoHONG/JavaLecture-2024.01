package Q2data;

public class Q02 {

// 1에서 20까지 홀수 제곱의 합을 구하세요.
	public static void main(String[] args) {
		int m = 20;
		int n = 0;
		
		for(int i = 1; i <= m; i++) {
			if(i % 2 == 1) {
				n += i*i;
			}
		}
		System.out.println("홀수 제곱의 합= " + n + "입니다.");
	}

}
