package ch05_reference;

import java.util.Arrays;

public class Ex02_ArrayCopy {

	public static void main(String[] args) {
		int src[] = {1, 2, 4, 8};
		int[] dst = src;
		System.out.println(Arrays.toString(dst));
		
		dst[2] = 5;
		System.out.println(Arrays.toString(dst));
		System.out.println(Arrays.toString(src));
	}

}
