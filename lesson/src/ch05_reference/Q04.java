package ch05_reference;

public class Q04 {

	public static void main(String[] args) {
		String pathStr = "C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js";
		String[] pathArray = pathStr.split("/");
		System.out.println(pathArray[pathArray.length -1]);
	}

}
