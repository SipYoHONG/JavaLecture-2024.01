package ch14_exception.sec21_Message;

public interface MessageService {
	   int DELETED = 1;

	   Message findByMid(int mid);
	   
	   void messageList();
	   
	   void messageListByWriter(String writer);
	   
	   void insertMessage(Message message);
	   
	   void updateMessage(Message message);
	   
	   void deleteMessage(int mid);

}