package datastructure.queue;

import datastructure.stack.StackUsingLinkedList;

/**
 * push : O(1)
 * pop : O(1)// amortized
 */
public class QueueUsingTwoStack {

    StackUsingLinkedList s1,s2;

    QueueUsingTwoStack() {
        s1= new StackUsingLinkedList();
        s2 = new StackUsingLinkedList();
    }

    public void enqueue(int data) {
        s1.push(data);
    }

    public int dequeue(){
        if(s2.isEmpty()){
            if(s1.isEmpty()) return -1;
            else {
                while(!s1.isEmpty()) s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int size() {
        return s1.size()+s2.size();
    }
}
