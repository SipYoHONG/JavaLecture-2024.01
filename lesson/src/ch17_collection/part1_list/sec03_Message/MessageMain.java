package ch17_collection.part1_list.sec03_Message;

import java.util.Scanner;
import java.util.List;

public class MessageMain {
    private static MessageService messageService = new MessageServiceListImpl();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int mid = 0;
        boolean run = true;

        while (run) {
            System.out.println("+=============+=================+==========+==========+==========+========+");
            System.out.println("| 1. 전체목록 | 2.Writer별 목록 | 3.글쓰기 | 4.글수정 | 5.글삭제 | 6.종료 |");
            System.out.println("+=============+=================+==========+==========+==========+========+");
            System.out.print("선택> ");

            int selectNo = Integer.parseInt(scan.nextLine());
            switch(selectNo) {
                case 1:
                	List<Message> allMessages = messageService.getMessageListAll();
//					list = messageService.getMessageListAll();
//					list.forEach(x -> System.out.println(x));
//					System.out.println();
                    break;                 
                case 2:
                    System.out.println("---------------");
                    System.out.println(" Writer별 목록");
                    System.out.println("---------------");
                    System.out.print("Writer 이름> ");
                    String writer = scan.nextLine();
                    List<Message> writerMessages = messageService.getMessageListByWriter(writer);
//				 	writer = scan.nextLine();
//					list = messageService.getMessageListByWriter(writer);
//					list.forEach(x -> System.out.println(x));
//					System.out.println();
                    break;
                case 3:
                    System.out.println("---------------");
                    System.out.println("  메세지 쓰기");
                    System.out.println("---------------");
                    System.out.print("Writer 이름> ");
                    String newWriter = scan.nextLine();
                    System.out.print("메세지 내용> ");
                    String content = scan.nextLine();
                    Message newMessage = new Message(content, newWriter);
                    messageService.insertMessage(newMessage);
                    //이 부분은 강사님이랑 비슷한데 Message, String 쓰면서 new 붙인게 조금 다름!
                    break;
                case 4:
                    System.out.println("---------------");
                    System.out.println("  메세지 수정");
                    System.out.println("---------------");
                    System.out.print("메세지 ID> ");
                    mid = Integer.parseInt(scan.nextLine());
//                  message = messageService.findByMid(mid);									<- 이렇게 선언을 했다는 가정하에
                    Message updateMessage = messageService.findByMid(mid);
                    System.out.print("Writer 이름(" + updateMessage.getWriter() + ")> ");	// <- updateMessage가 아니라 그냥 message로 하면 밑에로 처리하면됨
//                  writer = scan.nextLine();
                    String updatedWriter = scan.nextLine();
                    System.out.print("메세지 내용(" + updateMessage.getContent() + ")> ");	// <- updateMessage가 아니라 그냥 message로 하면 밑에로 처리하면됨
//                  content = scan.nextLine();
                    String updatedContent = scan.nextLine();
                    updateMessage.setWriter(updatedWriter);
                    updateMessage.setContent(updatedContent);
                    messageService.updateMessage(updateMessage);
                    break;
                case 5:
                    System.out.println("---------------");
                    System.out.println("  메세지 삭제");
                    System.out.println("---------------");
                    System.out.print("메세지 ID> ");
                    mid = Integer.parseInt(scan.nextLine());
                    messageService.deleteMessage(mid);
                    break;
                case 6:
                    run = false; 
                    break;
                default:
                    System.out.println("Warning: 1 ~ 6 사이의 숫자만 입력하세요.");
            }
        }
        System.out.println("프로그램 종료");
    }
}