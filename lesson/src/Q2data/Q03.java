package Q2data;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		int total = 0;
		
		for(int i= 2; i <= 100; i++) {
			if(isPrime(i))
			total += i;
		}
		System.out.printf("소수의 합: " + total);
	}

	
	static boolean isPrime(int num) {
		if(num < 2) {
			return false;			
		}
		
//		for(int i = 2; i <= num - 1; i++) <- Math.sqrt(num) 대신에 쓸수있음!
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}