package datastructure.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CloneLinkedList {

	public static Node cloneLinkedListWithRandomPointer(Node head) {
		
		Map<Node, Node> map = new HashMap<>();
		Node node = head;
		while(node != null) {
			map.put(node, new Node(node.data));
			node = node.next;
		}
		
		node = head;
		while(node != null) {
			Node copyNode = map.get(node);
			copyNode.next = map.get(node.next);
			copyNode.random = map.get(node.random);
			node = node.next;
		}
		
		return map.get(head);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.random = head.next.next;
		head.next.random = head;
		
		Node copyHead = cloneLinkedListWithRandomPointer(head);
		if(testCloneLinkedListWithRandomPointer(head,copyHead))System.out.println("successfully cloned");
		else System.out.println("cloning failed");
	}
	
	private static boolean testCloneLinkedListWithRandomPointer(Node head, Node copyHead) {
		while(head != null && copyHead != null) {
			if(head.data != copyHead.data) return false;
			head = head.next;
			copyHead = copyHead.next;
			//compareRandomNode(head.random,copyHead.random);
		}
		if(head != copyHead) return false;
		return true;
	}

	static class Node {
		int data;
		Node next;
		Node random;
		
		Node(int data) {
			this.data = data;
		}
	}

	
}


