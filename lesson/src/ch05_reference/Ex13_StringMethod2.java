package ch05_reference;

public class Ex13_StringMethod2 {

	public static void main(String[] args) {
		String str1 = "Hello Java";
		String str2 = "안녕하세요? 반갑습니다.";
		
		/* 대소문자 변경 */
		System.out.println(str1.toUpperCase());
		
		/* 문자열 대치(replace) */
		String str3 = str2.replace("안녕하세요", "안녕").replace("반갑습니다", "방가방가");
		System.out.println(str3);	//안녕? 방가방가.
		System.out.println(str3.replace("방가", "하이"));
		String regExp = str2.replaceAll("[?.]", "!");	// ? 또는 .을 !로 변경해라
		System.out.println(regExp);
		

	}

}
