package queue;

public class CircularQueueUsingArray {

	int front = -1;
	int rear = -1;
	int size = 4;
	int[] array;
	// 1 2 3 4 5
	//6 -- 6 1 2 3 4
	public CircularQueueUsingArray() {
		array = new int[size];
	}
		
	public void enqeue(int data) {
		if(rear+1 >= size) 	throw new RuntimeException("queue full.can't enqeue");
		rear=(rear+1)%size;
		array[rear] = data;
	}
	
	public int dequeue() {
		
		if(rear == -1 && front ==-1) throw new RuntimeException("queue empty.can't delete");
		if(rear+1 == size && front == -1 ) rear = -1;
		if(front+1 >=size) front = -1;
		front=(front+1)%size;
		int temp = array[front];
		array[front] = -1;
		return temp;
	}
	
	public void display() {
		
		for(int i =0;i<size;++i) {
			System.out.print(array[i] +" ");
		}
		System.out.println();
	}
	
}
