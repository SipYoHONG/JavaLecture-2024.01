package Q2data;

public class Q01 {

	// 1에서 100까지 3의 배수의 합을 구하세요
	
	public static void main(String[] args) {
		int value = 0;

		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0)
				value += i;
			else continue;
			System.out.println("sum= " + value + ",i= " + i);
		}
		System.out.println("value = " + value);
	}

}
