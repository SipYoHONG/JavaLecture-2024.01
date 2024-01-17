package ch05_reference;


public class Q03 {
	public static boolean isPalindrome(int num) {
	    String numStr = Integer.toString(num);
	    return numStr.equals(new StringBuilder(numStr).reverse().toString());
	}
		public static void main(String[] args) {
			int maxPal = 0, max1 = 0, max2 = 0;
			
			for(int i = 100; i <= 999; i++) {
				for (int k = i; k <= 999; k++) {
					int mul = i * k;
					if(isPalindrome(mul) && mul > maxPal) {
						maxPal = mul;
						max1 = i;
						max2 = k;
				}
			}
		}
			System.out.printf("가장 큰 Palindrome 수: %d%n해당 수를 만들기 위한 두 수: %d 와 %d%n", maxPal, max1, max2);
	}
}
