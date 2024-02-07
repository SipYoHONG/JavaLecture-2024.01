package mysql.sec06_uesr;

import java.util.List;

public interface UserSevice {

	public static final int CORRECT_LOGIN = 0;
	public static final int WRONG_PASSWORD = 1;
	public static final int USER_NOT_EXIST = 2;
	public static final int COUNT_PER_PAGE = 10;

	void registerUser(User user);

	List<User> getUserList(int page);

	void updateUser(User user);

	void deleteUser(User user);

	int login(String uid, String pwd);

	void close();

}
