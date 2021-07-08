package datastructure.stack;

import datastructure.queue.QueueUsingLinkedList;

/**
 * push : O(1)
 * pop : O(n)
 *
 */
public class StackUsingTwoQueue {

    QueueUsingLinkedList q1,q2;

    StackUsingTwoQueue() {
        q1 = new QueueUsingLinkedList();
        q2 = new QueueUsingLinkedList();
    }

    public void push(int data) {
        q1.enqueue(data);
    }

    public int pop() {
        if(q1.isEmpty() && q2.isEmpty()) return -1;
        if(q1.isEmpty()) {
            QueueUsingLinkedList temp =q1;
            q1=q2;
            q2=temp;
        }
        while(q1.size()!=1) {
            q2.enqueue(q1.dequeue());
        }
        return q1.dequeue();
    }

    public int size() {
        return q1.size()+ q2.size();
    }

}
