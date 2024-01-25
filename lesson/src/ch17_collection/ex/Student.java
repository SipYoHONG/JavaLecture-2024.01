package ch17_collection.ex;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student() { }
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
		if (this == obj)
	        return true;
	    if (obj == null || getClass() != obj.getClass())
	        return false;
	    Student other = (Student) obj;
	    return studentNum == other.studentNum;
	}	
}
