import java.util.*;

public class DequeExample {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // =========================
        // 1️⃣ USING DEQUE AS DEQUE
        // =========================
        dq.addFirst(10);   // front
        dq.addLast(20);    // rear
        dq.addFirst(5);

        System.out.println("Deque: " + dq);   // [5, 10, 20]

        dq.removeFirst(); // remove front
        dq.removeLast();  // remove rear

        System.out.println("Deque after removals: " + dq); // [10]

        // =========================
        // 2️⃣ USING DEQUE AS STACK (LIFO)
        // =========================
        dq.push(100);   // push = addFirst
        dq.push(200);

        System.out.println("Stack pop: " + dq.pop());  // 200
        System.out.println("Stack peek: " + dq.peek()); // 100

        // =========================
        // 3️⃣ USING DEQUE AS QUEUE (FIFO)
        // =========================
        dq.add(1);    // enqueue (addLast)
        dq.add(2);
        dq.add(3);

        System.out.println("Queue poll: " + dq.poll()); // 100
        System.out.println("Queue peek: " + dq.peek()); // 1
                System.out.println("Queue peek: " + dq); // 1
                 System.out.println("Queue peek: " + dq.isEmpty()); // 1
                  System.out.println("Queue peek: " + dq.size()); // 1
    }
}
