package ass7;
import java.util.EmptyStackException;
/*
*Problem 2. [Data Structures - Stack]
Take the demo code ArrayStackDemo.java. In that file Stack is implemented using
Array. Do the same behaviors by implementing stack using Linked List.[ Either using
singly linked list / Doubly linked list ]
* */
public class LinkedListStack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedListStack() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public int size() {
        return this.size;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            this.top = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
        this.size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T poppedItem = this.top.data;
        this.top = this.top.next;
        this.size--;
        return poppedItem;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.top.data;
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Size of the Stack: " + stack.size()); // Size of the Stack: 3
        System.out.println(stack.pop() + " is deleted"); // 3 is deleted
        System.out.println(stack.peek() + " is on top of stack"); // 2 is on top of stack
    }
}
