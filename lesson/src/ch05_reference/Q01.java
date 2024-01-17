package ch05_reference;

public class Q01 {

	public static void main(String[] args) {
			String numStr = "";
			for(int i = 1; i <= 1000; i++) {
				numStr += i;
			}
			int[] countArr = new int[10];
			for (char c : numStr.toCharArray()) {
				countArr[Character.getNumericValue(c)]++;
			}
			for (int i = 0; i < countArr.length; i++) {
				System.out.println(i + ": " + countArr[i]);
			}
		}
	}
