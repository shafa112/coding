package stack;

public class TestClient {

	public static void main(String[] args) {
		testSimple();
		//testEmptyStack();
	}
	
	static void testSimple() {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(5);
		stack.push(7);
		stack.push(9);
		
		System.out.println(stack.size() == 3);
		
		System.out.println(stack.pop() == 9);
		System.out.println(stack.pop() == 7);
		System.out.println(stack.pop() == 5);
		System.out.println(stack.pop() == -1);
	}
	
	static void testEmptyStack() {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		System.out.println(stack.size() == 0);
	}

	
}
