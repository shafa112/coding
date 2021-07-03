package datastructure.linkedlist;

import datastructure.linkedlist.Node;

//YshapedLL
//insert node from end to even positions
public class LinkedListOperations {

	public Node YshapedLinkedList(Node head1, Node head2) {
		
		Node h1 = head1;
		Node h2 = head2;
		int l1size = Size(head1);
		int l2size = Size(head2);
		if(l1size>l2size) {
			int count = l1size-l2size;
			while(count>0) {
				h1 = h1.next;
				--count;
			}
		} else {
			int count = l2size-l1size;
			while(count>0) {
				h2 = h2.next;
				--count;
			}
		}
		while(h1 !=null && h2!=null) {
			if(h1==h2) return h1;
			h1=h1.next;
			h2=h2.next;
		}
		return null;
	}
	
	private int Size(Node head) {
		Node temp = head;
		int size = 0;
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	public Node insertNodeFromEndToEvenPositionsFromStart(Node head) {
		Node head1 = head;
		int mid = Size(head1)/2;
		while(mid>0) {
			head1 = head1.next;
			--mid;
		}
		
		Node head2 = head1.next;
		head1.next = null;
		head2 = reverseLinkedList(head2);
		
		head1 = head;
		while(head1!=null && head1.next!=null && head2!=null) {
			Node temp = head2;
			head2 = head2.next;
			temp.next = head1.next;
			head1.next = temp;
			head1 = head1.next.next;
		}
		return head1;
	}
	
	public Node reverseLinkedList(Node head) { 	
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
		return head;
	}
	
	public Node addNumbersRepresentedByLL(Node head1,Node head2) {
		Node headFinal = null;
		int q = 0;
		if(head1 !=null && head2!=null) {
			int num = q+head1.data + head2.data;
			headFinal = new Node(num%10);
			q=num/10;
			head1 = head1.next;
			head2 = head2.next;
		}
		
		Node curr = headFinal;
		while(head1 !=null && head2!=null) {
			int num = q+head1.data + head2.data;
			curr.next =  new Node(num%10);
			curr = curr.next;
			q=num/10;
			head1 = head1.next;
			head2 = head2.next;
		}
		while(head1 !=null) {
			int num = q+head1.data;
			curr.next =  new Node(num%10);
			curr = curr.next;
			q=num/10;
			head1 = head1.next;
		}
		while(head2 !=null) {
			int num = q+head2.data;
			curr.next =  new Node(num%10);
			curr = curr.next;
			q=num/10;
			head2 = head2.next;
		}
		return headFinal;
	}
	
	public void print(Node head) {
		Node t = head ; 
		while(t != null) {
			System.out.print(t.data +" ");
			t = t.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperations linkedListOperations = new LinkedListOperations();
		
		
		/*Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);
		head1.next.next.next.next.next = new Node(6);
		linkedListOperations.print(head1);
		
		linkedListOperations.insertNodeFromEndToEvenPositionsFromStart(head1);
		linkedListOperations.print(head1);*/
		
		
		/*Node head2 = new Node(21);
		head2.next = new Node(22);
		head2.next.next = head1.next;
		linkedListOperations.print(head2);
		Node mergeNode = linkedListOperations.YshapedLinkedList(head1, head2);
		System.out.println(mergeNode.data);*/
		Node l = new Node(7);
		l.next = new Node(5);
		l.next.next = new Node(9);
		l.next.next.next = new Node(4);
		l.next.next.next.next = new Node(6);
		
		Node l2 = new Node(8);
		l2.next = new Node(4);
		Node add = linkedListOperations.addNumbersRepresentedByLL(l, l2);
		linkedListOperations.print(add);
		System.out.println();
	}
	
	

}
