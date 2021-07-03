package queue;

public class TestClientQueue {
	
	public static void main(String[] args) {
		
		CircularQueueUsingArray c = new CircularQueueUsingArray();
		
		c.enqeue(1);
		c.enqeue(2);
		c.enqeue(3);
		c.enqeue(4);
		c.dequeue();
		c.enqeue(5);
		c.enqeue(6);
		c.display();
		
		
	}

}
