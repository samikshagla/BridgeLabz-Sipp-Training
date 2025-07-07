

import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stackEnq = new Stack<>();
    private Stack<Integer> stackDeq = new Stack<>();

    // Enqueue operation
    public void enqueue(int x) {
        stackEnq.push(x);
    }

    // Dequeue operation
    public int dequeue() {
        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }
        if (stackDeq.isEmpty()) throw new RuntimeException("Queue is empty");
        return stackDeq.pop();
    }

    public boolean isEmpty() {
        return stackEnq.isEmpty() && stackDeq.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue()); 
        q.enqueue(4);
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
      
    }
} 