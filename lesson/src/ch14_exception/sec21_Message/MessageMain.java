package ch14_exception.sec21_Message;

import java.util.Scanner;

public class MessageMain {
	private static Scanner scanner = new Scanner(System.in);
	private static MessageService messageService = new MessageServiceArrayImpl();
	private int index = 5;
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("+=========================+");
			System.out.println("1. 전체 메시지 목록");
			System.out.println("2. 작성자로 메시지 필터링");
			System.out.println("3. 메시지 추가");
			System.out.println("4. 메시지 수정");
			System.out.println("5. 메시지 삭제");
			System.out.println("6. 메시지 조회");
			System.out.println("7. 종료");
			System.out.println("+=========================+");
			System.out.print("원하는 기능을 선택하세요: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); 
			
			switch (choice) {
			case 1:
				messageService.messageList();
				break;
			case 2:
				System.out.print("작성자를 입력하세요: ");
				String writerFilter = scanner.nextLine();
				messageService.messageListByWriter(writerFilter);
				break;
			case 3:
				System.out.print("메시지 내용을 입력하세요: ");
				String content = scanner.nextLine();
				System.out.print("작성자를 입력하세요: ");
				String writer = scanner.nextLine();
				System.out.print("날짜를 입력하세요 (yyyy-MM-dd): ");
				String genTime = scanner.nextLine();
				Message newMessage = new Message(++MessageServiceArrayImpl.index, content, writer, genTime);
				messageService.insertMessage(newMessage);
				System.out.println("메시지가 추가되었습니다.");
				break;
			case 4:
				System.out.print("수정할 메시지의 ID를 입력하세요: ");
				int updateMid = scanner.nextInt();
				scanner.nextLine(); 
				Message updateMessage = messageService.findByMid(updateMid);

				if (updateMessage != null) {
					System.out.print("새로운 메시지 내용을 입력하세요: ");
					String updatedContent = scanner.nextLine();
					updateMessage.setContent(updatedContent);
					messageService.updateMessage(updateMessage);
					System.out.println("메시지가 수정되었습니다.");
				} else {
					System.out.println("해당하는 ID의 메시지를 찾을 수 없습니다.");
				}
				break;
			case 5:
				System.out.print("삭제할 메시지의 ID를 입력하세요: ");
				int deleteMid = scanner.nextInt();
				scanner.nextLine(); // 버퍼 비우기
				messageService.deleteMessage(deleteMid);
				System.out.println("메시지가 삭제되었습니다.");
				break;
			case 6:
				System.out.print("조회할 메시지의 ID를 입력하세요: ");
				int searchMid = scanner.nextInt();
				scanner.nextLine(); // 버퍼 비우기
				Message foundMessage = messageService.findByMid(searchMid);

				if (foundMessage != null) {
					System.out.println("메시지 정보:");
					System.out.println("mid: " + foundMessage.getMid() + ", content: " + foundMessage.getContent()
							+ ", writer: " + foundMessage.getWriter() + ", genTime: " + foundMessage.getGenTime()
							+ ", isDeleted: " + foundMessage.getIsDeleted());
				} else {
					System.out.println("해당하는 ID의 메시지를 찾을 수 없습니다.");
				}
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("올바르지 않은 선택입니다. 다시 선택해주세요.");
			}
		}
	}
}