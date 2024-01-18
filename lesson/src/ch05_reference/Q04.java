package ch05_reference;

public class Q04 {

	public static void main(String[] args) {
		String pathStr = "C:\\Users\\human-02\\Documents\\GitHub\\JavaLecture-2024.01\\lesson\\src\\ch05_reference";
		String[] pathArray = pathStr.split("\\\\");		// "//" 정규표현식으로 인식해서 오류가 발생
		System.out.println(pathArray[pathArray.length -1]);
	}

}
