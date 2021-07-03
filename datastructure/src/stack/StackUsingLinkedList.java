package stack;

import linkedlist.LinkedList;

public class StackUsingLinkedList {

	private LinkedList list;
	
	public StackUsingLinkedList() {
		list = new LinkedList();
	}
	
	public boolean isEmpty() {
		return list.size() == 0;
	}
	
	public int top() {
		if(isEmpty()) return -1;
		return list.getHead().data;
	}
	
	public void push(int data) {
		list.insertNodeAtStart(data);
	}
	
	public int pop() {
		if(isEmpty()) return -1;
		return list.deleteHead().data;
	}
	
	public int size() {
		return list.size();
	}
}
