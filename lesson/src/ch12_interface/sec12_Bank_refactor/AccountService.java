package ch12_interface.sec12_Bank_refactor;

public interface AccountService {

	void createAccount();

	void accountList();

	void deposit();

	void withdraw();

	Account findAccount(String ano);

}
