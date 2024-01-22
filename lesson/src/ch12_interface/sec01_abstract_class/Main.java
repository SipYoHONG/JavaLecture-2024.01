package ch12_interface.sec01_abstract_class;

public class Main {

	public static void main(String[] args) {
		// 추상 클래스는 객체 생성 X	<= 미완성된 메소드를 포함하기에 불가능하다.
//		Animal animal = new Animal();
		
		Cat cat = new Cat();
		cat.cry();
		
		Dog dog = new Dog();
		dog.cry();
		
		//객체만 안되는거지 부모(상위)타입에서 가져오는건 가능~!
		Animal animal = new Cat();
		animal.cry();
	}

}
