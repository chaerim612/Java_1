package collection.stack_queue;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayqueue=new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayqueue.add(data);
	}
	
	public String deQueue() {
		int len=arrayqueue.size();
		if(len==0) {
			System.out.println("Queue가 비었습니다. ");
			return null;
		}
		return arrayqueue.remove(0);
	}
}


public class QueueTest {
	public static void main(String[] args) {
		MyQueue qu=new MyQueue();
		qu.enQueue("앵1");
		qu.enQueue("앵2");
		qu.enQueue("앵3");
		qu.enQueue("앵4");
		qu.enQueue("앵5");
		qu.enQueue("앵6");
		
		for (int i=0;i<6;i++) {
			System.out.println(qu.deQueue());
		}
	}
}
