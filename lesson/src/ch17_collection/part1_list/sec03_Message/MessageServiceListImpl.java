package ch17_collection.part1_list.sec03_Message;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageServiceListImpl implements MessageService {
	private List<Message> messageList = new ArrayList<Message>();

	public MessageServiceListImpl() {
		messageList = new ArrayList<>();
		messageList.add(new Message(101, "Java 세계에 오신 것을 환영합니다.", "James", LocalDateTime.now(), 0));
		messageList.add(new Message(102, "안녕하세요? 만나서 반갑습니다.", "Maria", LocalDateTime.now(), 0));
		messageList.add(new Message(103, "좋은 하루 되세요.", "Brian", LocalDateTime.now(), 0));
		messageList.add(new Message(104, "Human Education Center에서 강의 듣기.", "Emma", LocalDateTime.now(), 0));
		messageList.add(new Message(105, "함께 Spring Boot 배워봐요.", "James", LocalDateTime.now(), 0));
	}

	@Override
	public Message findByMid(int mid) {
		for (Message m : messageList) {
			if (m.getMid() == mid) {
				return m;
			}
		}
		return null;
	}

	@Override
	public List<Message> getMessageListAll() {
		 System.out.println("메세지 서비스에서 모든 메세지를 가져옵니다...");
		    List<Message> allMessages = new ArrayList<>();
		    allMessages.addAll(messageList);
		    System.out.println("모든 메세지: " + allMessages);
		    return allMessages;
	}

	@Override
	public List<Message> getMessageListByWriter(String writer) {
	    System.out.println("메세지 서비스에서 작성자별 메세지를 가져옵니다...");
	    List<Message> result = new ArrayList<>();
	    for (Message message : messageList) {
	        if (message.getWriter().equals(writer) && message.getIsDeleted() != MessageService.DELETED) {
	            result.add(message);
	        }
	    }
	    System.out.println("작성자별 메세지: " + result);
	    return result;
	}

	@Override
	public void insertMessage(Message message) {
		int mid = 101 + messageList.size();
		message.setMid(mid);
		message.setModTime(LocalDateTime.now());
		messageList.add(message);
	}

	@Override
	public void updateMessage(Message message) {
		for (int i = 0; i < messageList.size(); i++) {
			if (messageList.get(i).getMid() == message.getMid()) {
				messageList.set(i, message);
				return;
			}
		}
	}

	@Override
	public void deleteMessage(int mid) {
		Message msg = findByMid(mid);
		if (msg != null) {
			msg.setIsDeleted(MessageService.DELETED);
		}
	}
}