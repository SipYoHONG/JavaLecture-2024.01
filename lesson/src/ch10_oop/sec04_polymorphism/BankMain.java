package ch10_oop.sec04_polymorphism;

import java.util.Scanner;

public class BankMain {
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	private static int index = 3;

	public static void main(String[] args) {
		boolean run = true;
		accountArray[0] = new Account("1000", "제임스", 10000);
		accountArray[1] = new Account("1001", "마리", 300000);
		accountArray[2] = new Account("1002", "브라이언", 2000000);
		while (run) {
			System.out.println("+============+============+========+=========+========+");
			System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료 |");
			System.out.println("+============+============+========+=========+========+");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				createAccount(); break;
			case 2:
				accountList(); break;
			case 3:
				deposit(); break;
			case 4:
				withdraw(); break;
			case 5:
				run = false; break;
			default:
				System.out.println("Warning: 1 ~ 5 사이의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}
	private static void createAccount() {
		System.out.println("-----------");
		System.out.println(" 계좌 생성");
		System.out.println("-----------");
		
		String ano = "" + (1000 + index);		// index : 현재 빈 곳을 가리킴
//		System.out.print("계좌 번호> ");
//		String ano = scan.nextLine();
		System.out.print("계좌주 이름> ");
		String owner = scan.nextLine();
		System.out.print("최초 입금액> ");
		int balance = Integer.parseInt(scan.nextLine());
		Account account = new Account(ano, owner, balance);
		
		accountArray[index++] = account;
//		for (int i = 0; i < accountArray.length; i++) {
//			if (accountArray[i] != null)
//				continue;
//			accountArray[i] = account;
//		}
		
		System.out.println("계좌가 생성되었습니다.");
	}
	private static void accountList() {
		System.out.println("-----------");
		System.out.println(" 계좌 목록");
		System.out.println("-----------");	
		
		for (int i = 0; i < index; i++) {
			Account acc = accountArray[i];
			System.out.printf("%s %-6s\t%,10d%n", acc.getAno(), acc.getOwner(), acc.getBalance());
		}
	}
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("   입금");
		System.out.println("-----------");	
		
		System.out.print("계좌 번호> ");
		String ano = scan.nextLine();
		System.out.print("입금액> ");
		int balance = Integer.parseInt(scan.nextLine());
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;
		}
		account.setBalance(balance + account.getBalance());
		System.out.println("입금이 완료되었습니다.");
	}
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("   출금");
		System.out.println("-----------");	
		
		System.out.print("계좌 번호> ");
		String ano = scan.nextLine();
		System.out.print("출금액> ");
		int balance = Integer.parseInt(scan.nextLine());
		Account account = findAccount(ano);	
		if (account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;
		}
		if (account.getBalance() >= balance) {
			account.setBalance(account.getBalance() - balance);
			System.out.println("출금이 완료되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	private static Account findAccount(String ano) {
//		for (int i = 0; i < accountArray.length; i++) {
//			if (ano.equals(accountArray[i].getAno()))
//				return accountArray[i];
//		}
		for (Account acc: accountArray) {
			if (acc == null)
				return null;
			if (ano.equals(acc.getAno()))
				return acc;
		}
		return null;
	}
}
//package ch10_oop.sec04_polymorphism;
//
//import java.util.Scanner;
//
//public class BankMain {
//	
//	private static Account[] accountArray = new Account[100];
//	private static Scanner scanner = new Scanner(System.in);
//	
//	public static void main(String[] args) {
//		boolean run = true;
//		while(run) {
//			System.out.println(" ----------------------------------------------------- ");
//			System.out.println("  1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
//			System.out.println(" ----------------------------------------------------- ");
//			System.out.print("선택: ");
//			
//			int selectNo = scanner.nextInt();
//			
//			if(selectNo == 1) {
//				createAccount();
//			} else if (selectNo == 2) {
//				accountList();
//			} else if (selectNo == 3) {
//				deposit();
//			} else if (selectNo == 4) {
//				withdraw();
//			} else if (selectNo == 5) {
//				run = false;
//			}
//		}
//		System.out.println("프로그램 종료");
//	}
//	
//	//계좌생성하기
//	private static void createAccount() {
//		System.out.println("---------");
//		System.out.println("계좌생성");
//		System.out.println("---------");	
//		System.out.println("계좌번호: ");
//		String ano = scanner.next();
//		System.out.println("계좌주: ");
//		String owner = scanner.next();
//		System.out.println("초기입금액: ");
//		int balance = scanner.nextInt();
//		
//		Account account = new Account(ano, owner, balance);
//		for (int i = 1; i < accountArray.length; i++) {
//			if (accountArray[i] == null) {
//				accountArray[i] = account;
//				System.out.println("결과: 계좌가 생성되었습니다.");
//				break;
//			}
//		}
//	}
//	
//	//계좌목록보기
//	private static void accountList() {
//		System.out.println("---------");
//		System.out.println("계좌목록");
//		System.out.println("---------");
//		
//		for (int i = 1; i < accountArray.length; i++) {
//			Account account = accountArray[i];
//			if (account != null) {
//				System.out.print(account.getAno());
//				System.out.print("				");
//				System.out.print(account.getOwner());
//				System.out.print("              ");
//				System.out.print(account.getBalance());
//				System.out.println();
//			}
//		}	
//	}
//	
//	//예금하기
//	private static void deposit() {
//		System.out.println("---------");
//		System.out.println("예금");
//		System.out.println("---------");	
//		System.out.println("계좌번호: ");
//		String ano = scanner.next();
//		
//		Account account = findAccount(ano);
//		if (account == null) {
//			System.out.println("계좌가 없습니다.");
//			return;
//		}
//		System.out.println("예금액: ");
//		int money = scanner.nextInt();
//		
//		account.setBalance(account.getBalance() + money);
//		System.out.println("예금이 성공되었습니다.");
//		System.out.println("현재 금액: " + account.getBalance());
//		
//	}
//	
//	//출금하기
//	private static void withdraw() {
//		System.out.println("---------");
//		System.out.println("출금");
//		System.out.println("---------");	
//		System.out.println("계좌번호: ");
//		String ano = scanner.next();
//		
//		Account account = findAccount(ano);
//		if (account == null) {
//			System.out.println("계좌가 없습니다.");
//			return;
//		}
//		System.out.println("출금액: ");
//		int money = scanner.nextInt();
//		
//		if (account.getBalance() > money) {
//			account.setBalance(account.getBalance() - money);
//			System.out.println("출금이 성공되었습니다.");
//			System.out.println("현재 금액: " + account.getBalance());
//			
//		} else {
//			System.out.println("잔액이 부족합니다.");
//		}
//	}
//	
//	//Account 배열에서 ano와 동일한 Account 객체 찾기
//	private static Account findAccount(String ano) {
//		Account account = null;
//		for (int i = 1; i < accountArray.length; i++) {
//			if (accountArray[i] != null) {
//				String dbAno = accountArray[i].getAno();
//				if (dbAno.equals(ano)) {
//					account = accountArray[i];
//					break;
//				}
//			}
//		}
//		return account;
//	}
//}


//package ch10_oop.sec05_Bank;
//
//import java.util.Scanner;
//
//public class Main {
//
//    private static Account[] accountArray = new Account[100];
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        boolean run = true;
//        while (run) {
//            System.out.println(" -------------------------------------------------- ");
//            System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
//            System.out.println(" -------------------------------------------------- ");
//            System.out.print("선택> ");
//
//            int selectNo = scanner.nextInt();
//
//            switch (selectNo) {
//                case 1:
//                    createAccount();
//                    break;
//                case 2:
//                    accountList();
//                    break;
//                case 3:
//                    deposit();
//                    break;
//                case 4:
//                    withdraw();
//                    break;
//                case 5:
//                    run = false;
//                    break;
//                default:
//                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
//            }
//        }
//        System.out.println("프로그램 종료");
//    }
//
//    // 계좌생성하기
//    private static void createAccount() {
//        System.out.println("---------");
//        System.out.println("계좌생성");
//        System.out.println("---------");
//
//        System.out.print("계좌번호: ");
//        String ano = scanner.next();
//        System.out.print("계좌주: ");
//        String owner = scanner.next();
//        System.out.print("초기입금액: ");
//        int balance = scanner.nextInt();
//
//        Account account = new Account(ano, owner, balance);
//        for (int i = 0; i < accountArray.length; i++) {
//            if (accountArray[i] == null) {
//                accountArray[i] = account;
//                System.out.println("결과: 계좌가 생성되었습니다.");
//                break;
//            }
//        }
//    }
//
//    // 계좌목록보기
//    private static void accountList() {
//        System.out.println("---------");
//        System.out.println("계좌목록");
//        System.out.println("---------");
//
//        for (Account account : accountArray) {
//            if (account != null) {
//                System.out.printf("%s\t\t%s\t\t%d\n", account.getAno(), account.getOwner(), account.getBalance());
//            }
//        }
//    }
//
//    // 예금하기
//    private static void deposit() {
//        System.out.println("---------");
//        System.out.println("예금");
//        System.out.println("---------");
//        System.out.print("계좌번호: ");
//        String ano = scanner.next();
//
//        Account account = findAccount(ano);
//        if (account == null) {
//            System.out.println("계좌가 없습니다.");
//            return;
//        }
//        System.out.print("예금액: ");
//        int money = scanner.nextInt();
//
//        account.setBalance(account.getBalance() + money);
//        System.out.println("예금이 성공되었습니다.");
//        System.out.println("현재 금액: " + account.getBalance());
//    }
//
//    // 출금하기
//    private static void withdraw() {
//        System.out.println("---------");
//        System.out.println("출금");
//        System.out.println("---------");
//        System.out.print("계좌번호: ");
//        String ano = scanner.next();
//
//        Account account = findAccount(ano);
//        if (account == null) {
//            System.out.println("계좌가 없습니다.");
//            return;
//        }
//        System.out.print("출금액: ");
//        int money = scanner.nextInt();
//
//        if (money > account.getBalance()) {
//            System.out.println("잔액이 부족합니다.");
//        } else {
//            account.setBalance(account.getBalance() - money);
//            System.out.println("출금이 성공되었습니다.");
//            System.out.println("현재 금액: " + account.getBalance());
//        }
//    }
//
//    // Account 배열에서 ano와 동일한 Account 객체 찾기
//    private static Account findAccount(String ano) {
//        for (Account account : accountArray) {
//            if (account != null && account.getAno().equals(ano)) {
//                return account;
//            }
//        }
//        return null;
//    }
//}

