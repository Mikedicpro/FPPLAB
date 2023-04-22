package ass7;

public class MainArryQ {
    public static void main(String[] args) {
        ArrayQueueImpl queue=new ArrayQueueImpl();
        System.out.println("Is the queue empty? "+queue.isEmpty());
        queue.enqueue(50);
        queue.enqueue(51);
        queue.enqueue(100);
        System.out.println("Size of queue: ? "+queue.size());
        System.out.println("Peek of queue? "+ queue.peek());
        System.out.println("Dequeue of queue ?"+queue.dequeue());
        System.out.println("Size of queue ? "+ queue.size());

    }
}
