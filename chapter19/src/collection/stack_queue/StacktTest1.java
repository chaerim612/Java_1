package collection.stack_queue;

import java.util.Stack;

public class StacktTest1 {
	public static void main(String[] args) {
		Object obj;
		
		//empty 스택 생성
		Stack<Object> st=new Stack<Object>();
		
		if (st.empty()) {
			for(int i=0;i<=3;i++) {
				st.push(new String("Hi!"+(i+1)));
				System.out.println("입력 :"+(i+1)+"번째"+st.peek());
			}
				
		}
		st.pop();
		System.out.println("현재 top의 위치: "+st.peek());
		st.pop();
		System.out.println("현재 top의 위치: "+st.peek());
		
		st.push(new String("everybody"));
		System.out.println(st.peek());
		
		st.push(new String("Nice Day!"));
		System.out.println(st.peek());
	}
	
}
