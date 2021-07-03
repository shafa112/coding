package queue;

public class TestClient {

	public static void main(String[] args) {
		testSimple();
	}
	
	public static void testSimple() {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		
		System.out.println(queue.size()==3);
		System.out.println(queue.dequeue()==5);
		System.out.println(queue.dequeue()==6);
		System.out.println(queue.dequeue()==7);
	}

}
