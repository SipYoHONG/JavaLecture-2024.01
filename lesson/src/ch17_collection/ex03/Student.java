package ch17_collection.ex03;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;

	public Student() {
	}

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student) obj;
			return other.studentNum == this.studentNum;
		} else {
			return false;
		}
	}
}
