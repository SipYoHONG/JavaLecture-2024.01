package ch10_oop.sec03_override;

public class Child extends Parent {
	int childField;
	
	void childMethod() {
		System.out.println("childMethod(): " + childField);
	}
	
	// 메소드 재정의 - 부모가 정의한 메소드를 자식이 새롭게 정의 하는것
	@Override
	void parentMethod() {
//		System.out.println("child가 새롭게 정의한 parentMethod(): " + parentField);
		System.out.print("child가 새롭게 정의한 ");
		super.parentMethod();
	}
}
