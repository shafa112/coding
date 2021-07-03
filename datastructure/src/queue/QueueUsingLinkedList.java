package queue;

import linkedlist.LinkedList;

public class QueueUsingLinkedList {
	
	LinkedList list;
	
	public QueueUsingLinkedList() {
		list = new LinkedList();
	}
	
	public int peek() {
		if(isEmpty()) return -1;
		return list.getHead().data;
	}
	
	public boolean isEmpty() {
		return list.size()==0;
	}
	
	public void enqueue(int data) {
		list.insertNodeAtEnd(data);
	}
	
	public int dequeue() {
		if(isEmpty()) return -1;
		return list.deleteHead().data;
	}
	
	public int size() {
		return list.size();
	}

}
