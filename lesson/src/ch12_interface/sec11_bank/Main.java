package ch12_interface.sec11_bank;

import java.util.Scanner;

public class Main {
	
    private static Account[] accountArray = new Account[100];
    private static AccountService accountService = new AccountServiceImpl();
    private static Scanner scan = new Scanner(System.in);
    private static int index = 3;

    public static void main(String[] args) {
        initAccounts();

        boolean run = true;
        while (run) {
            printMenu();
            int selectNo = Integer.parseInt(scan.nextLine());
            switch (selectNo) {
                case 1 -> accountService.createAccount(accountArray);
                case 2 -> accountService.accountList(accountArray);
                case 3 -> accountService.deposit(accountArray);
                case 4 -> accountService.withdraw(accountArray);
                case 5 -> run = false;
                default -> System.out.println("Warning: 1 ~ 5 사이의 숫자만 입력하세요.");
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void initAccounts() {
        accountArray[0] = new Account("1000", "제임스", 10000);
        accountArray[1] = new Account("1001", "마리", 300000);
        accountArray[2] = new Account("1002", "브라이언", 2000000);
    }

    private static void printMenu() {
        System.out.println("+============+============+========+=========+========+");
        System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료 |");
        System.out.println("+============+============+========+=========+========+");
        System.out.print("선택> ");
    }
}