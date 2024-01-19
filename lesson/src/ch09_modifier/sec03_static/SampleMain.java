package ch09_modifier.sec03_static;

public class SampleMain {

	public static void main(String[] args) {
		
		Sample sample = new Sample();
		System.out.println(sample.instanceField);
		sample.instanceMethod();
		
		System.out.println(Sample.STATIC_FIELD);
		Sample.staticMethod();

	}

}
