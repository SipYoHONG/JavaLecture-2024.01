package ch06_class.sec01_member;	// package 같으면 허용범위가 제한될수있음 

import java.time.LocalDate;

public class Member {			// public <-- 접근제한자
	private String name;
	private LocalDate brithday;
	private String email;
	
	public Member() { }
	
	public Member(String name, LocalDate brithday, String email) {
		this.name = name;
		this.brithday = brithday;
		this.email = email;
	}

	public int getAge() {
		return 0;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", brithday=" + brithday + ", email=" + email + "]";
	}
}
class A {
	
}
