package ch05_reference;

import java.util.Arrays;

public class Ex04_MainArgs {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		
		String[] command = "git add .".split(" ");
		command = "git commit	-m \"Reference Type\"".split("\\s+"); // 공백(white space) 여러개로 분리
		System.out.println(Arrays.toString(command));

	}

}
