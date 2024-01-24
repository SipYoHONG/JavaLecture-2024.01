package ch14_exception.sec21_Message;

import java.util.Scanner;

public class MessageServiceArrayImpl implements MessageService {
	private static Scanner scanner = new Scanner(System.in);
	private static Message[] messageArray;
	static int index = 5;

	public MessageServiceArrayImpl() {
		messageArray = new Message[5];
		messageArray[0] = new Message(1, "처음하는", "홍시표", "2024-01-23");
		messageArray[1] = new Message(2, "자바는", "시표", "2024-01-23");
		messageArray[2] = new Message(3, "복잡하지만", "홍사표", "2024-01-23");
		messageArray[3] = new Message(4, "재밌게", "홍표", "2024-01-23");
		messageArray[4] = new Message(5, "열심히하자", "홍시범", "2024-01-23");
	}

	@Override
	public Message findByMid(int mid) {
		for (Message message : messageArray) {
			if (message != null && message.getMid() == mid) {
				return message;
			}
		}
		return null;
	}

	@Override
	public void messageList() {
		for (Message message : messageArray) {
			if (message != null) {
				System.out.println("mid: " + message.getMid() + ", content: " + message.getContent() + ", writer: "
						+ message.getWriter() + ", genTime: " + message.getGenTime() + ", isDeleted: "
						+ message.getIsDeleted());
			}
		}
	}

	@Override
	public void messageListByWriter(String writer) {
		for (Message message : messageArray) {
			if (message != null && message.getWriter().equals(writer)) {
				System.out.println("mid: " + message.getMid() + ", content: " + message.getContent() + ", writer: "
						+ message.getWriter() + ", genTime: " + message.getGenTime() + ", isDeleted: "
						+ message.getIsDeleted());
			}
		}
	}

	@Override
	public void insertMessage(Message message) {
		for (int i = 0; i < messageArray.length; i++) {
			if (messageArray[i] == null) {
				messageArray[i] = message;
				return;
			}
		}
		System.out.println("메세지를 추가할 공간이 부족함.");
	}

	@Override
	public void updateMessage(Message message) {
		for (int i = 0; i < messageArray.length; i++) {
			if (messageArray[i] != null && messageArray[i].getMid() == message.getMid()) {
				messageArray[i] = message;
				return;
			}
		}
		System.out.println("해당하는 mid의 메시지를 찾을 수 없음.");
	}

	@Override
	public void deleteMessage(int mid) {
		for (int i = 0; i < messageArray.length; i++) {
			if (messageArray[i] != null && messageArray[i].getMid() == mid) {
				messageArray[i] = null;
				return;
			}
		}
		System.out.println("해당하는 mid의 메시지를 찾을 수 없음.");
	}
}
