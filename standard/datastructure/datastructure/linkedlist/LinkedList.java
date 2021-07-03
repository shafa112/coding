package datastructure.linkedlist;

public class LinkedList {

	Node head;
	Node tail;
	
	public Node getHead() {
		return head;
	}
	
	// O(1)
	public void insertNodeAtStart(int data) {
		if(head==null) {
			head = new Node(data);
			tail = head;
		} else {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
	}
	
	// O(1)
	public void insertNodeAtEnd(int data) {
		if(head==null) {
			head = new Node(data);
			tail = head;
		} else {
			tail.next = new Node(data);
			tail = tail.next;
			/*Node newNode = new Node(data);
			Node temp = head;
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next = newNode;*/
		}
	}
	
	public int size() {
		Node temp = head;
		int size = 0;
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}
	
	public Node searchFirst(int data) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == data) return temp;
			temp = temp.next;
		}
		return null;
	}
	
	public void deleteFirstMatch(int data) {
		if(head == null) return;
		if(head.data == data) {
			head = head.next;
			if(head == null) {
				tail = null;
			}
		} else {
			Node prev = head;
			Node dnode = head;
			while(dnode!=null) {
				if(dnode.data == data) {
					if(dnode.next==null) {
						tail = prev;
					}
					prev.next = dnode.next;
					break;
				}
				prev = dnode;
				dnode = dnode.next;
			}
		}
	}
	
	public Node deleteHead() {
		if(head == null) throw new RuntimeException("Linked List is empty already");
		Node temp = head;
		head = head.next;
		return temp;
	}
	
	public boolean isExist(int data) {
		return searchFirst(data) != null;
	}
	
	public Node getMid() {
		Node h1=head;
		Node h2=head;
		while(h1!=null && h1.next!=null) {
			h2=h2.next;
			h1=h1.next.next;
		}
		return h2;
	}   
	
	public Node getKthNodeFromEnd(int k) { 	
		Node h1 = head;
		Node h2 = head;
		int count = 0;
		while(count<k)	{
			h1=h1.next;
			++count;
		}
		while(h1!=null)	{
			h1=h1.next;
			h2=h2.next;
		}
		return h2;
	} 
	
	//should reverse the current linked list 
	public void reverseLinkedList() { 	
		Node t =null;
		Node c = null;
		while(head.next!=null) {
			c=head;
			head=head.next;
			c.next=t;
			t=c;
		}
		if(head.next==null) {
			head.next=c;
		}
	}
	
	public Node reverseRecursive(Node head) {
		if(head == null || head.next == null) return head;
		Node rest = reverseRecursive(head.next);
		head.next.next = head;
		return rest;
	}
	
	public boolean hasCycle()
	{
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast)return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String ret = "";
		Node temp = head;
		while (temp != null) {
			ret = ret + "[" + temp + "] -->";
			temp = temp.next;
		}
		ret = ret + "null";
		return ret;
	}
	
	
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertNodeAtEnd(2);
		linkedList.insertNodeAtEnd(3);
		linkedList.insertNodeAtEnd(4);
		linkedList.insertNodeAtEnd(5);
		System.out.println(linkedList);
		//linkedList.reverseLinkedList();
		//System.out.println(linkedList);
		
		
		
		
	}
}
