package mysql.sec06_uesr;

import java.util.List;

public class UserTest {

	public static void main(String[] args) {
		UserService usc =  new UserServiceMySQLImpl();
		User user = null;
		
//		user = new User("james", "1234", "제임스", "james@naver.com");
//		usc.registerUser(user);
//		user = new User("maria", "5678", "마리아", "maria@naver.com");
//		usc.registerUser(user);
//		user = new User("brian", "9999", "브라이언", "brian@naver.com");
//		usc.registerUser(user);
//		user = new User("sarah", "1616", "사라", "sarah@naver.com");
//		usc.registerUser(user);
		
//		user = usc.getUserByUid("admin");
//		System.out.println(user);
//		
//		user = usc.getUserByUid("james");
//		System.out.println(user);
		
//		System.out.println(usc.login("admin", "1234"));
//		System.out.println(usc.login("admin", "asdf"));
//		System.out.println(usc.login("james", "1234"));
		
		List<User> list = usc.getUserList(2);
		list.forEach(x -> System.out.println(x));
				
		usc.close();
	}

}
