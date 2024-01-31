package Q2data;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		int total = 0;
		
		for(int i= 2; i <= 100; i++) {
			if(isPrime(i))
			total += i;
		}
		System.out.println("소수의 합: " + total);
	}

	
	public static boolean isPrime(int num) {
		if(num < 2) return false;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}