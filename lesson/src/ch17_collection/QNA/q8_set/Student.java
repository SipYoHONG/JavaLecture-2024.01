package ch17_collection.QNA.q8_set;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
//		return studentNum;
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentNum, other.studentNum);
	}
	
	
	
	
}
