package innOperation;

import java.util.Stack;

public class TwoStack {

	/**
	 * ������Ŀ������ջʵ��һ������
	 * ˼·���������Ƚ��ȳ���ջ���Ƚ����������ʹ������ջ��ʵ�ֶ���
	 */
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) { //��ջ
        stack1.push(node);
    }
    
    public int pop() { //��ջ
    	if(!stack2.isEmpty()){
    		return stack2.pop();
    	}
    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
		return stack2.pop();
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
