package datastructure.stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> s1 ;
    Stack<Integer> s2 ;

    public MinStack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int data) {
        s1.push(data);
        if(s2.isEmpty()) s2.push(data);
        else
        {
            if(data<s2.peek()) s2.push(data);
            else s2.push(s2.peek());
        }
    }

    public int pop() {
        if(s1.isEmpty()) return -1;
        s2.pop();
        return s1.pop();
    }

    public int getMin() {
        if(s2.isEmpty()) return -1;
        return s2.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(4);
        minStack.push(10);
        System.out.println(minStack.getMin()==4);
        minStack.push(9);
        minStack.push(2);
        System.out.println(minStack.getMin()==2);
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.getMin()==4);
    }

}
