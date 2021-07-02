package collection.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain {
	public static void main(String[] args) {
		Queue<Message> messageQueue=new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","이호진"));
		messageQueue.offer(new Message("sendSNS","김지영"));
		messageQueue.offer(new Message("sendKakaoTalk","홍길동"));
		
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to);
			case "sendSNS":
				System.out.println(message.to);
			case "sendKakaoTalk":
				System.out.println(message.to);
			default:
				System.out.println("전송 오류");
			}
		}
	}
}
