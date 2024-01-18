package ch06_class.sec01_member;

	import java.time.LocalDate;

	public class Member {			// public <-- 접근제한자
		// 필드, 멤버, 속성
		public String name;
		private LocalDate brithday;
		private String email;
		
		// 생성자(Constructor)
		public Member() { }
		
		public Member(String name, LocalDate brithday, String email) {
			this.name = name;
			this.brithday = brithday;
			this.email = email;	
		}
		
		// 메소드(method)
		public int getAge() {
			LocalDate today = LocalDate.now();
			int year = today.getYear();
			int month = today.getMonthValue();
			int day = today.getDayOfMonth();
			int age = (month < brithday.getMonthValue() || (month == brithday.getMonthValue() && day < brithday.getDayOfMonth())) ? 
					year - brithday.getYear() - 1 : year - brithday.getYear();
			return age;
		}
		public LocalDate getBrithday() {
				return brithday;
			}
		
			public void setBrithday(LocalDate brithday) {
				this.brithday = brithday;
			}
		
			public String getEmail() {
				return email;
			}
		
			public void setEmail(String email) {
				this.email = email;
			}
		@Override
		public String toString() {
			return "Member [name=" + name + ", brithday=" + brithday + ", email=" + email + 
					", age=" + getAge() + "]";
		}
	}
		
		
		
//		------------------- * 쓸일없음 * -------------------------
		// 내부 클래스
//		class InnerCalss {
			
//		}
		
	//} 

		// 외부 클래스
	//  class ExternalClass {
		
