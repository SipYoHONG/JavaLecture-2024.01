package ch17_collection.ex02;

public class Student implements Comparable<Student> {
	public String id;
	public int score;
	
	public Student() { }
	public Student(String id, int score) {

		this.id = id;
		this.score = score;
	}
	@Override
	public int compareTo(Student o) {
		if(o instanceof Student) {
			Student other = (Student) o;
			return this.score - other.score;
//			return Integer.compare(this.score, other.score);
		}
		return 0;
	}

	
}
